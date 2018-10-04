package com.example.ginni.listview;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    ListView listView;
    static ArrayList<String> array = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        String text = getIntent().getStringExtra("data");
        array.add(text);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = array.get(position);
                String data = text.toLowerCase();
                if(data.contentEquals("dialerpad") || data.contentEquals("dialer pad")) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:(9599665803"));
                    startActivity(intent);
                } else if (data.contentEquals("browser")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://github.com/ginnigarg"));
                    startActivity(intent);
                } else if (data.contentEquals("camera")) {
                    Intent intent =  new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                } else if (data.contentEquals("gallery")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("content://media/external/images/media"));
                    startActivity(intent);
                } else  {
                    Intent intent = new Intent(ListviewActivity.this, last.class);
                    intent.putExtra("data",text);
                    startActivity(intent);
                }
            }
        });
    }
}
