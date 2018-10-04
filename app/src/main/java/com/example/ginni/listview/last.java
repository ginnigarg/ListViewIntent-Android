package com.example.ginni.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class last extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        mTextView =  findViewById(R.id.textView);
        String text = getIntent().getStringExtra("data");
        mTextView.setText(text);
    }
}
