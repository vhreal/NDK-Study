package com.example.ndktest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView tv = new TextView(this);
		tv.setText(NDKTestFromJNI());
		setContentView(tv);
	}

	public native String NDKTestFromJNI();// native声明，表示这个方法来自Native层。实现过程已经在native层实现了

	static {
		System.loadLibrary("NDKTest");// 加载库，前面的lib和后缀名不用写
	}
}
