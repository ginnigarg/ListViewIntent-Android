package com.example.ginni.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class last extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        textView =  (TextView) findViewById(R.id.textView);
        Intent prevIntent = getIntent();
        String text = prevIntent.getStringExtra("data");
        textView.setText(text);

    }
}
