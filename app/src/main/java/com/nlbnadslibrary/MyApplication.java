package com.nlbnadslibrary;

import com.nlbn.ads.billing.AppPurchase;
import com.nlbn.ads.util.AppOpenManager;
import com.nlbn.ads.util.AdsApplication;
import com.nlbn.ads.util.AppUtil;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends AdsApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        AppOpenManager.getInstance().disableAppResumeWithActivity(Splash.class);
    }

    @Override
    public boolean enableAdsResume() {
        return true;
    }

    @Override
    public List<String> getListTestDeviceId() {
        return null;
    }

    @Override
    public String getResumeAdId() {
        return "ca-app-pub-3940256099942544/3419835294";
    }

    @Override
    public Boolean buildDebug() {
        return true;
    }


}
