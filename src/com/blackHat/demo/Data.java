package com.blackHat.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener{
Button start, startFor;
EditText sendET;
TextView gotAnswer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		initialize();
	}
	
	
	private void initialize()
	{
		start=(Button)findViewById(R.id.bSA);
		startFor=(Button)findViewById(R.id.bSAFR);
		sendET=(EditText)findViewById(R.id.etSend);
		gotAnswer=(TextView)findViewById(R.id.tvGot);
		start.setOnClickListener(this);
		startFor.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	

}
