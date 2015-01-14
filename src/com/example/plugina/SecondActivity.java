package com.example.plugina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		TextView tv = new TextView(getApplicationContext());
		tv.setText("����ͨ�����빹���Ľ���. \n �����ť��ת��ͨ��xml��Դ���ù����ĵ�����Activity.");
		layout.addView(tv);
		
		Button btn = new Button(this);
		btn.setText("go to third activity");
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				SecondActivity.this.startActivity(intent);
			}
		});
		layout.addView(btn);
		setContentView(layout);
		
//		setContentView(R.layout.activity_second);
	}
}
