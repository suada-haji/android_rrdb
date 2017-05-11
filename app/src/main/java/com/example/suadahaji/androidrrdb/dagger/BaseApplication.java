package com.example.suadahaji.androidrrdb.dagger;

import android.app.Application;

/**
 * This class instantiates the component
 */

public class BaseApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = AppComponent.Initializer.init(this);
        component.inject(this);
    }

    public AppComponent getComponent() {
        return component;
    }
}
