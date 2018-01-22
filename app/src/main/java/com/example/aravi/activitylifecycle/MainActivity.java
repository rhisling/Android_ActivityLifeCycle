package com.example.aravi.activitylifecycle;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button dialogButton;
    Button startactivitybButton;
    Button closeMainActivityButton;
    public static TextView activityList;
    public static TextView counterText;
    public static int counter=0;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: IN");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialogButton = (Button) findViewById(R.id.dialog);
        startactivitybButton = (Button) findViewById(R.id.startactivityb);
        closeMainActivityButton = (Button) findViewById(R.id.closeapp);
        counterText = (TextView) findViewById(R.id.counter);
        activityList = (TextView) findViewById(R.id.activitylist);
        activityList.setMovementMethod(new ScrollingMovementMethod());
        activityList.setText("");
        activityList.append("Activity A: onCreate() Method\n");
        counter += 1;
        counterText.setText(String.valueOf(counter));
        View.OnClickListener startactivitybOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter += 1;
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                intent.putExtra("counter",counter);
                startActivity(intent);

            }
        };

        View.OnClickListener dialogButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Alert message to be shown");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();*/
                counter += 1;
                Intent intent = new Intent(MainActivity.this, ActivityDialog.class);
                startActivity(intent);

            }
        };

        View.OnClickListener closeMainButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: hello");
                finish();
            }
        };

        dialogButton.setOnClickListener(dialogButtonOnClickListener);
        startactivitybButton.setOnClickListener(startactivitybOnClickListener);
        closeMainActivityButton.setOnClickListener(closeMainButtonListener);

        Log.d(TAG, "onCreate: OUT");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: IN");
        super.onStart();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onStart() Method\n");
        Log.d(TAG, "onStart: OUT");
    }


    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: IN");
        super.onResume();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onResume() Method\n");
        Log.d(TAG, "onResume: OUT");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: IN");
        super.onRestoreInstanceState(savedInstanceState);
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onRestoreInstanceState() Method\n");
        Log.d(TAG, "onRestoreInstanceState: OUT");
    }


    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: IN");
        super.onRestart();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onRestart() Method\n");
        Log.d(TAG, "onRestart: OUT");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: IN");
        super.onPause();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onPause() Method\n");
        Log.d(TAG, "onPause: OUT");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: IN");
        super.onStop();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onStop() Method\n");
        Log.d(TAG, "onStop: OUT");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: IN");
        super.onSaveInstanceState(outState);
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onSaveInstanceState() Method\n");
        Log.d(TAG, "onSaveInstanceState: OUT");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: IN");
        super.onDestroy();
        //counter += 1;
        counterText.setText(String.valueOf(counter));
        activityList.append("Activity A: onDestroy() Method\n");
        counter = 0;
        Log.d(TAG, "onDestroy: OUT");
    }
}
