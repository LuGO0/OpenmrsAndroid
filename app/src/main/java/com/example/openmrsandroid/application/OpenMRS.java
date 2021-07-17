package com.example.openmrsandroid.application;

import androidx.multidex.MultiDexApplication;

import com.example.openmrs_android_sdk.library.OpenmrsAndroid;

import java.io.File;

public class OpenMRS extends MultiDexApplication {
    private static final String OPENMRS_DIR_NAME = "OpenMRS";
    private static final String OPENMRS_DIR_PATH = File.separator + OPENMRS_DIR_NAME;
    private static String mExternalDirectoryPath;
    private static OpenMRS instance;

    public static OpenMRS getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        OpenmrsAndroid.initializeSdk(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}

