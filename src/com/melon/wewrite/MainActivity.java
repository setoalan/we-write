package com.melon.wewrite;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		EditText mEditText = (EditText) findViewById(R.id.editText);
		final TextViewUndoRedo mTVUR = new TextViewUndoRedo(mEditText);
		
		Button mUndo = (Button) findViewById(R.id.undo);
		mUndo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mTVUR.undo();
			}
		});
		
		Button mRedo = (Button) findViewById(R.id.redo);
		mRedo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mTVUR.redo();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
