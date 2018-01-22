package com.example.aravi.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ActivityDialog extends AppCompatActivity {

    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog);
        okButton = (Button) findViewById(R.id.ok);

        View.OnClickListener dialogListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };

        okButton.setOnClickListener(dialogListener);
    }
}
