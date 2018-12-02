package com.example.sith3.tourplanner.launcher.view;

import android.os.Bundle;

import com.example.sith3.tourplanner.BaseActivity;
import com.example.sith3.tourplanner.util.PreferenceHelper;

public abstract class LauncherActivity extends BaseActivity {

    public boolean isLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isLogin = mPreferenceHelper.getBoolean(PreferenceHelper.IS_LOGIN,false);
        if(isLogin){

        }
        else {
            
        }
    }
}
