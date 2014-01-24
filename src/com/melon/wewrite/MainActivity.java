package com.melon.wewrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
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
import edu.umich.imlc.collabrify.client.exceptions.ConnectException;

public class MainActivity extends Activity implements CollabrifySessionListener, CollabrifyListSessionsListener,
													CollabrifyBroadcastListener, CollabrifyCreateSessionListener,
													CollabrifyJoinSessionListener, CollabrifyLeaveSessionListener {

	private static String TAG = "WeWrite";
	
	private static final String GMAIL = "user email";
	private static final String DISPLAY_NAME = "user display name";
	private static final String ACCOUNT_GMAIL = "441winter2014@umich.edu";
	private static final String ACCESS_TOKEN = "338692774BBE";
	
	private CollabrifyClient myClient;
	private EditText mEditText;
	private Button mUndo, mRedo, mCreateSession, mLeaveSession, mJoinSession;
	private ArrayList<String> tags = new ArrayList<String>();
	private long sessionId;
	private String sessionName;
	
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
		mUndo = (Button) findViewById(R.id.undo);
		mRedo = (Button) findViewById(R.id.redo);
		mCreateSession = (Button) findViewById(R.id.create_session);
		mLeaveSession = (Button) findViewById(R.id.leave_session);
		mJoinSession = (Button) findViewById(R.id.join_session);
		
		final TextViewUndoRedo mTVUR = new TextViewUndoRedo(mEditText);
		
		mUndo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mTVUR.undo();
			}
		});

		mRedo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mTVUR.redo();
			}
		});
		
		mCreateSession.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					myClient.createSession("sessionName", tags, null, 1, createSessionListener, sessionListener);
				} catch (ConnectException e) {
					e.printStackTrace();
				} catch (CollabrifyException e) {
					e.printStackTrace();
				}
			}
		});
		
		mLeaveSession.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		mJoinSession.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
			}
		});
		
		try {
			myClient = CollabrifyClient.newClient(this, GMAIL, DISPLAY_NAME, ACCOUNT_GMAIL, ACCESS_TOKEN, false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		tags.add("melon");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onError(CollabrifyException arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDisconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSessionJoined(long arg0, long arg1) {
		// TODO Auto-generated method stub
		
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
	public void onBroadcastDone(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceiveSessionList(List<CollabrifySession> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBaseFileReceived(File arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBaseFileUploadComplete(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFurtherJoinsPrevented() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onParticipantJoined(CollabrifyParticipant arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onParticipantLeft(CollabrifyParticipant arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceiveEvent(long arg0, int arg1, String arg2, byte[] arg3,
			long arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSessionEnd(long arg0) {
		// TODO Auto-generated method stub
		
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
