package com.rainbowt.ads;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class GameApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Google Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
    }
}
