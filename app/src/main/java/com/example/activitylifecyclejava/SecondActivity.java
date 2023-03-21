package com.example.activitylifecyclejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String TAG = "Second Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");

        Log.d(TAG, "onCreate");
        Toast.makeText(this,"I am on onCreate from Second Activity",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
        Toast.makeText(this,"I am onStart from Second Activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
        Toast.makeText(this,"I am onResume from Second Activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause");
        Toast.makeText(this,"I am onPause from Second Activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop");
        Toast.makeText(this,"I am onStop from Second Activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart");
        Toast.makeText(this,"I am onRestart from Second Activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy");
        Toast.makeText(this,"I am onDestroy from Second Activity",Toast.LENGTH_SHORT).show();
    }

}