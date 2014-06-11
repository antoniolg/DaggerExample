package com.antonioleiva.daggerexample.app.domain;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true
)
public class DomainModule {

    @Provides @Singleton public AnalyticsManager provideAnalyticsManager(Application app){
        return new AnalyticsManager(app);
    }

}
