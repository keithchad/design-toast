package com.chad.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.chad.designtoast.DesignToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DesignToast.makeText(this, "Hello", Toast.LENGTH_SHORT, DesignToast.TYPE_ERROR).show();
    }
}