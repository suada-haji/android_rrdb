package com.example.suadahaji.androidrrdb.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * This class creates and provides App Context Dependency
 * @Provides marks the method in the Module which returns dependency
 * @Singleton annotation means only one instance will be created
 */

@Module
public class AppModule {
    private final BaseApplication application;

    public AppModule(BaseApplication application) {
        this.application = application;
    }

    @Provides
    Context providesApplicationContext() {
        return application.getApplicationContext();
    }

}
