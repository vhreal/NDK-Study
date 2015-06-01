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

	public native String NDKTestFromJNI();// native��������ʾ�����������Native�㡣ʵ�ֹ����Ѿ���native��ʵ����

	static {
		System.loadLibrary("NDKTest");// ���ؿ⣬ǰ���lib�ͺ�׺������д
	}
}
