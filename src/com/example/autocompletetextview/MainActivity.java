package com.example.autocompletetextview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView myAuto;
	private String[] books=new String[]{"Android平台开发之旅","Android开发案例驱动教程",
			"Android揭秘","疯狂Android讲义","Android从零开始"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,books);
		myAuto=(AutoCompleteTextView) this.findViewById(R.id.myAuto);
		myAuto.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
