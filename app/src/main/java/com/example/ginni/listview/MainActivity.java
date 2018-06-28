package com.example.ginni.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                if(text.contentEquals("")) {
                    Toast.makeText(getApplicationContext(),"Enter some Data",Toast.LENGTH_LONG);
                } else {
                    Intent intent = new Intent(MainActivity.this , ListviewActivity.class);
                    intent.putExtra("data",text);
                    startActivity(intent);
                }

            }
        });

    }
}
