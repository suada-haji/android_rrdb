package com.example.suadahaji.androidrrdb.dagger;

import com.example.suadahaji.androidrrdb.api.ApiModule;

import dagger.Component;

/**
 * This class provides methods that are used to access the dependencies that exists.
 * Bridges the modules and the base application class
 */

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {

    void inject(BaseApplication baseApplication);

    final class Initializer {

        /**
         * In the init() method, DaggerAppComponent is autogenerated and
         * used to create the component.
         */
        static AppComponent init(BaseApplication app) {


            return DaggerAppComponent.builder()
                    .appModule(new AppModule(app))
                    .build();
        }
    }

}
