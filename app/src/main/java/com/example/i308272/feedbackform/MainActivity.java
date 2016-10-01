package com.example.i308272.feedbackform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_NAME = "com.example.myfirstapp.NAME";
    public final static String EXTRA_EMAIL = "com.example.myfirstapp.EMAIL";
    public final static String EXTRA_MSG = "com.example.myfirstapp.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText nameView = (EditText) findViewById(R.id.EditTextName);
        String name = nameView.getText().toString();

        EditText emailView = (EditText) findViewById(R.id.EditTextEmail);
        String email = emailView.getText().toString();

        EditText msgView = (EditText) findViewById(R.id.EditTextFeedbackBody);
        String msg  = msgView.getText().toString();

        Intent intent = new Intent(this,PerviewActivity.class);
        intent.putExtra(EXTRA_NAME,name);
        intent.putExtra(EXTRA_MSG,msg);
        intent.putExtra(EXTRA_EMAIL,email);

        startActivity(intent);

    }

}
