package com.antonioleiva.daggerexample.app.domain;

import android.app.Application;
import android.widget.Toast;

public class AnalyticsManager {

    private Application app;

    public AnalyticsManager(Application app) {
        this.app = app;
    }

    public void registerAppEnter() {
        Toast.makeText(app, "App enter", Toast.LENGTH_LONG).show();
    }
}
