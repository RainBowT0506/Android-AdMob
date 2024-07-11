package com.rainbowt.ads.ad;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class AdService {

    private static final String TAG = "AdService";

    public static void loadRewardedVideo(Context context, AdLoadCallback callback) {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(context, "ca-app-pub-3940256099942544/5224354917",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.d(TAG, loadAdError.toString());
                        if (callback != null) {
                            callback.onAdFailedToLoad(loadAdError);
                        }
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        Log.d(TAG, "Ad was loaded.");
                        if (callback != null) {
                            callback.onAdLoaded(ad);
                        }
                    }
                });
    }

    public interface AdLoadCallback {
        void onAdLoaded(RewardedAd ad);

        void onAdFailedToLoad(LoadAdError error);
    }

}
