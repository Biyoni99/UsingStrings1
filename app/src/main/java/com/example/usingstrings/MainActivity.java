package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i("Lifecycle","OnCreate() called ");

        TextView txtvmsg2 = findViewById(R.id.tvmsg2);
        txtvmsg2.setText(R.string.msg2);

    }
    @Override
    public void onStart() {

        super.onStart();
        Log.i("Lifecycle", "onStart() called");
    }
    @Override
    public void onResume() {

        super.onResume();
        Log.i("Lifecycle", "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "onDestroy() called");
    }
}