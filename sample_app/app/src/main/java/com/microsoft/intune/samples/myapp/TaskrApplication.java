/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.intune.samples.myapp;

import android.app.Application;
/**
 * Specifies what happens when the app is launched and terminated.
 *
 * Registers an authentication callback for MAM.
 */
public class TaskrApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
