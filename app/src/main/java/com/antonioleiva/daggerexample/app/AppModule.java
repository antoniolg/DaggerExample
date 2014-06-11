package com.antonioleiva.daggerexample.app;

import android.app.Application;

import com.antonioleiva.daggerexample.app.domain.DomainModule;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                App.class
        },
        includes = {
                DomainModule.class
        }
)
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides public Application provideApplication() {
        return app;
    }
}
