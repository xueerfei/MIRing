package com.xd.miring;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * create by feijie.xfj
 * 2015-11-22
 * */
public class MainActivity extends Activity {

	RingView mringView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mringView =(RingView) findViewById(R.id.ringView);
		findViewById(R.id.startHeartBeatTest).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mringView.startAnim();
			}
		});
	}

}
