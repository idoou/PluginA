package com.example.plugina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		createCodeView();
		//
	}

	private void createCodeView() {
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		TextView tv = new TextView(getApplicationContext());
		tv.setText("This is PluginA Activity. \n 点击按钮通过Intent Action方式跳转到第二个Activity.");
		
		LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		layout.addView(tv, lp);
		
		Button btn = new Button(this);
		btn.setText("go to second activity");
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent("com.example.plugina.SecondActivity.action");
//				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
		layout.addView(btn);
		setContentView(layout);
	}


}
