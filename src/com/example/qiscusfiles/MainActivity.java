package com.example.qiscusfiles;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	
	//String files = "file_1";
	String[] files = {"files_0", "files_1", "files_2", "files_3", "files_4" };
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView judul = (TextView)findViewById(R.id.judul);
		judul.setText("QisqusFiles");
		Customadapter adapter = new Customadapter(this, R.layout.list_item, R.id.tulisan, files);
		setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
