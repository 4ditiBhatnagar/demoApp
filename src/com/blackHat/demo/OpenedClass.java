package com.blackHat.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener {
	TextView question, data;
	Button returnData; 
	RadioGroup selectionList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
	}
private void initialize()
{
	question=(TextView)findViewById(R.id.tvQuestion);
	data=(TextView)findViewById(R.id.tvText);
	returnData=(Button)findViewById(R.id.bReturn);
	returnData.setOnClickListener(this);		
	selectionList.setOnCheckedChangeListener();
}
@Override
public void onClick(View arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
	// TODO Auto-generated method stub
	
}
	
}
