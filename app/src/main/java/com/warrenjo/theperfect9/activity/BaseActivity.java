package com.warrenjo.theperfect9.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.warrenjo.theperfect9.BuildConfig;
import com.warrenjo.theperfect9.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setAd(RelativeLayout relativeLayout) {

        MobileAds.initialize(this, getString(R.string.admob_app_id));

        AdView adView = new AdView(getApplicationContext());
        adView.setAdSize(AdSize.BANNER);
        if (BuildConfig.DEBUG) {
            adView.setAdUnitId(getString(R.string.banner_ad_unit_id_for_test));
        } else {
            adView.setAdUnitId(getString(R.string.banner_ad_unit_id));
        }
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // Place the ad view.
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        relativeLayout.addView(adView, params);
    }
}
