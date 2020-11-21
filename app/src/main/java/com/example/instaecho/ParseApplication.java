package com.example.instaecho;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("j4MZ1TtXcoEnKesw15aHAA4xupzEn6lslKIYq175")
                .clientKey("IWNyQO3VAT6RIdPc1rtLcEzPqhENXkDjeg6k6xMR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}