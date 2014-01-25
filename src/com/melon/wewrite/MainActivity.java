package com.melon.wewrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import edu.umich.imlc.android.common.Utils;
import edu.umich.imlc.collabrify.client.CollabrifyClient;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifyBroadcastListener;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifyCreateSessionListener;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifyJoinSessionListener;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifyLeaveSessionListener;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifyListSessionsListener;
import edu.umich.imlc.collabrify.client.CollabrifyListener.CollabrifySessionListener;
import edu.umich.imlc.collabrify.client.CollabrifyParticipant;
import edu.umich.imlc.collabrify.client.CollabrifySession;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyException;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyUnrecoverableException;
import edu.umich.imlc.collabrify.client.exceptions.ConnectException;
import edu.umich.imlc.collabrify.client.exceptions.LeaveException;

public class MainActivity extends Activity implements CollabrifySessionListener, CollabrifyListSessionsListener,
													CollabrifyBroadcastListener, CollabrifyCreateSessionListener,
													CollabrifyJoinSessionListener, CollabrifyLeaveSessionListener {

	private static String TAG = "WeWrite";
	
	private static final String GMAIL = "user email";
	private static final String DISPLAY_NAME = "user display name";
	private static final String ACCOUNT_GMAIL = "441winter2014@umich.edu";
	private static final String ACCESS_TOKEN = "338692774BBE";
	
	private CollabrifyClient myClient;
	public static EditText mEditText;
	private Button mCreateSession, mJoinSession;
	private ArrayList<String> tags = new ArrayList<String>();
	private long sessionId;
	private String sessionName;
	private TextViewUndoRedo mTVUR;
	
	private CollabrifySessionListener sessionListener = this;
	private CollabrifyListSessionsListener listSessionsListener = this;
	private CollabrifyBroadcastListener broadcastListener = this;
	private CollabrifyCreateSessionListener createSessionListener = this;
	private CollabrifyJoinSessionListener joinSessionListener = this;
	private CollabrifyLeaveSessionListener leaveSessionListener = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mEditText = (EditText) findViewById(R.id.editText);
		mCreateSession = (Button) findViewById(R.id.create_session);
		mJoinSession = (Button) findViewById(R.id.join_session);
		mTVUR = new TextViewUndoRedo(mEditText);
		
		try {
			myClient = CollabrifyClient.newClient(this, GMAIL, DISPLAY_NAME, ACCOUNT_GMAIL, ACCESS_TOKEN, false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		tags.add("melon");
	}
	
	public void undo(View view) {
		mTVUR.undo();
	}
	
	public void redo(View view) {
		mTVUR.redo();
	}
	
	public void broadcast(View view) {
		if (mEditText.getText().toString().isEmpty())
			return;
		if (myClient != null && myClient.inSession()) {
			try {
				myClient.broadcast(mEditText.getText().toString().getBytes(), "letter", broadcastListener);
				mEditText.getText().clear();
				// Broadcast cursor change using mEditText().getSelectionStart(), etc.
				// Calls onBroadcastDone
			} catch (CollabrifyException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createSession(View view) {
		try {
			myClient.createSession("Melon Session Name", tags, null, 1, createSessionListener, sessionListener);
			// Calls onSessionCreated
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (CollabrifyException e) {
			e.printStackTrace();
		}
	}
	
	public void joinSession(View view) {
		if (myClient.inSession())
			return;
		try {
			myClient.requestSessionList(tags, listSessionsListener);
			// Calls onReceiveSessionList
		} catch (CollabrifyException e) {
			e.printStackTrace();
		}
	}
	
	public void leaveSession(View view) {
		if (!myClient.inSession())
			return;
		try {
			myClient.leaveSession(false, leaveSessionListener);
			// Calls onDisconnect
		} catch (LeaveException e) {
			e.printStackTrace();
		} catch (CollabrifyException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onError(CollabrifyException e) {
		if (e instanceof CollabrifyUnrecoverableException) {
			// The client has been reset and we are no longer in a session
			onDisconnect();
		}
		Log.e(TAG, "error", e);
	}

	@Override
	public void onDisconnect() {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				showToast("Left session");
				mJoinSession.setText(R.string.join_session);
			}
		});
	}

	@Override
	public void onSessionJoined(long maxOrderId, long baseFileSize) {
		sessionName = myClient.currentSession().name();
		sessionId = myClient.currentSession().id();
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				showToast("Session Joined");
				mJoinSession.setText(sessionName);
			}
		});
	}

	@Override
	public void onSessionCreated(final CollabrifySession session) {
		sessionId = session.id();
		sessionName = session.name();
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				showToast("Session created, id: " + session.id());
				mCreateSession.setText(sessionName);
			}
		});
	}

	@Override
	public void onBroadcastDone(final byte[] event, long orderId, long srid) {
		showToast(new String(event) + " broadcasted");
	}

	@Override
	public void onReceiveSessionList(List<CollabrifySession> sessionList) {
		if (sessionList.isEmpty()) {
			showToast("No session available");
			return;
		}
		displaySessionList(sessionList);
	}
	
	private void displaySessionList(final List<CollabrifySession> sessionList) {
		// Create a list of session names
		List<String> sessionNames = new ArrayList<String>();
		for (CollabrifySession s : sessionList)
			sessionNames.add(s.name());
		
		// Create a dialog to show the list of session names to the user
		final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
		builder.setTitle("Choose Session");
		builder.setItems(sessionNames.toArray(new String[sessionList.size()]), new DialogInterface.OnClickListener() {	
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// When the user chooses a session, join it
				sessionId = sessionList.get(which).id();
				try {
					myClient.joinSession(sessionId, null, joinSessionListener, sessionListener);
				} catch (ConnectException e) {
					e.printStackTrace();
				} catch (CollabrifyException e) {
					e.printStackTrace();
				}
			}
		});
		
		// Display the dialog
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				builder.show();
			}
		});
	}

	@Override
	public void onBaseFileReceived(File baseFile) {
		// UNUSED
	}

	@Override
	public void onBaseFileUploadComplete(long baseFileSize) {
		// UNUSED
	}

	@Override
	public void onFurtherJoinsPrevented() {
		// UNUSED	
	}

	@Override
	public void onParticipantJoined(CollabrifyParticipant arg0) {
		// UNUSED
	}

	@Override
	public void onParticipantLeft(CollabrifyParticipant arg0) {
		// UNUSED
	}

	@Override
	public void onReceiveEvent(long orderId, int submissionRegistrationId,
			String eventType, final byte[] data, long elapsed) {
		Utils.printMethodName(TAG);
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				Utils.printMethodName(TAG);
				String message = new String(data);
				mEditText.setText(message);
				// Add necessary changes to EditText view when receiving
			}
		});
	}

	@Override
	public void onSessionEnd(long arg0) {
		// UNUSED
	}
	
	private void showToast(final String text) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
