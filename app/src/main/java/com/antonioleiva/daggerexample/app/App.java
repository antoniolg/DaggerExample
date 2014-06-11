package com.antonioleiva.daggerexample.app;

import android.app.Application;

import com.antonioleiva.daggerexample.app.domain.AnalyticsManager;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class App extends Application {

    private ObjectGraph objectGraph;
    @Inject AnalyticsManager analyticsManager;

    @Override public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(getModules().toArray());
        objectGraph.inject(this);
        analyticsManager.registerAppEnter();
    }

    private List<Object> getModules() {
        return Arrays.<Object>asList(new AppModule(this));
    }
}
