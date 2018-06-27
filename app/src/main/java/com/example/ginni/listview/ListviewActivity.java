package com.example.ginni.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        Intent prevIntent = getIntent();
        String text = prevIntent.getStringExtra("data");

        ArrayList<String> array = new ArrayList<String>();
        array.add(text);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

    }
}
