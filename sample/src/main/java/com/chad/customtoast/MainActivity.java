package com.chad.customtoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.chad.designtoast.DesignToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        Button buttonSuccess = findViewById(R.id.buttonSuccess);
        Button buttonWarning = findViewById(R.id.buttonWarning);
        Button buttonError = findViewById(R.id.buttonError);
        Button buttonInfo = findViewById(R.id.buttonInfo);

        buttonSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSuccessToast();
            }
        });

        buttonWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWarningToast();
            }
        });

        buttonError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showErrorToast();
            }
        });

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfoToast();
            }
        });

    }

    private void showSuccessToast() {
        DesignToast.makeText(this, "SUCCESS", DesignToast.TYPE_SUCCESS).show();
    }

    private void showWarningToast() {
        DesignToast.makeText(this, "WARNING", DesignToast.TYPE_WARNING).show();
    }

    private void showErrorToast() {
        DesignToast.makeText(this, "ERROR", DesignToast.TYPE_ERROR).show();
    }

    private void showInfoToast() {
        DesignToast.makeText(this, "INFO", DesignToast.TYPE_INFO).show();
    }

}