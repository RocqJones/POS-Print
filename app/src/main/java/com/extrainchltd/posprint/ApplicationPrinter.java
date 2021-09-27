package com.extrainchltd.posprint;

import android.app.Application;

import com.mazenrashed.printooth.Printooth;

public class ApplicationPrinter extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Printooth.INSTANCE.init(this);
    }
}
