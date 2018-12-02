package com.example.sith3.tourplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sith3.tourplanner.util.PreferenceHelper;

public abstract class BaseActivity extends AppCompatActivity {

    public PreferenceHelper mPreferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        mPreferenceHelper = PreferenceHelper.getInstance(this);
    }

    protected void init(){

    }
}
