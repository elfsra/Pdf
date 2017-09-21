package com.example.asus.pdf;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;

        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener(){


        public void onClick (View view){
            Intent intent = new Intent(context,Webview.class);
                startActivity(intent);
    }


           });
}}
