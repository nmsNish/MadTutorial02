package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    private static final String TAG = "Lifecycle";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "OnCreate() invoked");

        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume() invoked");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "OnDestroy() invoked");
    }
}