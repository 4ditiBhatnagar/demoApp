package com.blackHat.demo;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener{
	    Intent i;
		ImageButton ib;
		Button b;
		ImageView iv;
		final static int cameraData=0;
		Bitmap bmp;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.photo);
			initialize();
			InputStream is= getResources().openRawResource(R.drawable.ic_launcher);  //accessing res folder, raw folder, setting input stream
			bmp=BitmapFactory.decodeStream(is);
		}
		
		private void initialize()
		{
			iv=(ImageView)findViewById(R.id.ivReturnedPic);
			ib=(ImageButton)findViewById(R.id.ibTakePic);
			b=(Button)findViewById(R.id.bSetWall);
			b.setOnClickListener(this);
			ib.setOnClickListener(this);
			
		}

		@SuppressWarnings("deprecation")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			//Setting phone's background
			case R.id.bSetWall:
				try{
				getApplicationContext().setWallpaper(bmp); //setting wallpaper needs permission, using camera/mail app doesnot
				}catch(IOException e){
					e.printStackTrace();
				}
				break;
			case R.id.ibTakePic:
				i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(i,cameraData);
				break;
			}
		}

		@Override
		protected void onActivityResult(int requestCode, int resultCode,
				Intent data) {
			// TODO Auto-generated method stub
			super.onActivityResult(requestCode, resultCode, data);
			//if statement for safety, if all is ok
			if(resultCode == RESULT_OK){
				Bundle extras = data.getExtras();
				bmp= (Bitmap)extras.get("data");
				iv.setImageBitmap(bmp);
				
			
			}
		}
		
		
		
	
}
