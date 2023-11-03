package com.cubicussol.sdkrelease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cubicussol.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.simpleToast(this,"dsafsa");
    }
}