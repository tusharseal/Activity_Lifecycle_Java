package com.example.activitylifecyclejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "Main Activity";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        button = findViewById(R.id.button);

        Log.d(TAG, "onCreate");
        Toast.makeText(this,"I am on onCreate from MainActivity",Toast.LENGTH_SHORT).show();

        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
        Toast.makeText(this,"I am onStart from MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
        Toast.makeText(this,"I am onResume from MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause");
        Toast.makeText(this,"I am onPause from MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop");
        Toast.makeText(this,"I am onStop from MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart");
        Toast.makeText(this,"I am onRestart from MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy");
        Toast.makeText(this,"I am onDestroy from MainActivity",Toast.LENGTH_SHORT).show();
    }

}