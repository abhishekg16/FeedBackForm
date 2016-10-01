package com.example.i308272.feedbackform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class PerviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perview);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String msg = intent.getStringExtra(MainActivity.EXTRA_MSG);


        //TextView TopTextPreview = new TextView(this);

        //TextView nameView = new TextView(this);
        TextView nameView = (TextView) findViewById(R.id.preview_edit_name);
        nameView.setText(name);
        nameView.setTextSize(20);


        //TextView emailView = new TextView(this);
        TextView emailView = (TextView) findViewById(R.id.preview_edit_email);
        emailView.setText(email);
        emailView.setTextSize(20);

        //TextView msgView = new TextView(this);
        TextView msgView = (TextView) findViewById(R.id.preview_edit_msg);
        msgView.setText(msg);
        msgView.setTextSize(20);



        //ViewGroup layout = (ViewGroup) findViewById(R.id.activity_perview);
        //layout.addView(nameView);
        //layout.addView(emailView);
        //layout.addView(msgView);



    }


}
