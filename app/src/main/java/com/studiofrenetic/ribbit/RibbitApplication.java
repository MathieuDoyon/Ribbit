package com.studiofrenetic.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;
import com.studiofrenetic.ribbit.ui.MainActivity;

/**
 * Created by mathieu on 2014-06-19.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this,
                "5pA7eoWbGXpkSH55vvDVGbURj3MHJfa3IUl3nlkK",
                "yGYJxTRJSLtyLL9y3zzpTDmUR4LogalJiSyd8FBd"
        );

        PushService.setDefaultPushCallback(this, MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
