package com.example.aravi.activitylifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button finishButton;
    private static final String TAG = "ActivityB";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: IN");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        finishButton = (Button) findViewById(R.id.finish);

        View.OnClickListener finishListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Hello");
                       finish();
            }
        };

        finishButton.setOnClickListener(finishListener);
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onCreate() Method\n");
        Log.d(TAG, "onCreate: OUT");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: IN");
        super.onStart();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onStart() Method\n");
        Log.d(TAG, "onStart: OUT");
    }


    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: IN");
        super.onResume();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onResume() Method\n");
        Log.d(TAG, "onResume: OUT");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: IN");
        super.onRestoreInstanceState(savedInstanceState);
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onRestoreInstanceState() Method\n");
        Log.d(TAG, "onRestoreInstanceState: OUT");
    }


    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: IN");
        super.onRestart();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onRestart() Method\n");
        Log.d(TAG, "onRestart: OUT");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: IN");
        super.onPause();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onPause() Method\n");
        Log.d(TAG, "onPause: OUT");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: IN");
        super.onStop();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onStop() Method\n");
        Log.d(TAG, "onStop: OUT");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: IN");
        super.onSaveInstanceState(outState);
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onSaveInstanceState() Method\n");
        Log.d(TAG, "onSaveInstanceState: OUT");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: IN");
        super.onDestroy();
        //MainActivity.counter += 1;
        MainActivity.counterText.setText(String.valueOf(MainActivity.counter));
        MainActivity.activityList.append("Activity B: onDestroy() Method\n");
        Log.d(TAG, "onDestroy: OUT");
    }

}
