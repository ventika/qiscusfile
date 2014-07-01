package com.example.qiscusfiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Customadapter extends ArrayAdapter<String> {

	private String[] files;
	private Context context;
	
	public Customadapter(Context context, int resource, int tulisan, String[] objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.files = objects;
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater.inflate(R.layout.list_item,  parent, false);
		TextView tulisan = (TextView) convertView.findViewById(R.id.tulisan);
		tulisan.setText(files[position]);
		
		return convertView;
	}

}
