package com.example.plugina;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("ThirdActivity.onCreate()");
		TextView tv = new TextView(this);
		tv.setText(R.string.hello_world);
		System.out.println("----- after call resource");

//		try {
//			String text = getResources().getString(R.string.hi_girl);
//			
//		} catch (Exception e) {
//			throw new NullPointerException("Not found resource 'R.string.hi_girl'");
//		}
//		tv.setText(text);
		
		setContentView(tv);
		
//		setContentView(R.layout.activity_third);
	}
	
	@Override
	public Resources getResources() {
		System.out.println("----- call ThirdActivity.getResources");
		System.out.println("----- super ="+super.getApplicationContext().getClass());
		System.out.println("----- super ="+super.getClass());
		System.out.println("----- this ="+ getClass());
		return super.getResources();
	}
}
