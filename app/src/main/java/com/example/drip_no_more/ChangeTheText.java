package com.example.drip_no_more;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeTheText{
    private String stringValue; // A string parameter

    private static ChangeTheText instance = null;
    public static ChangeTheText getInstance() {
        if (instance == null) {
            instance = new ChangeTheText();
        }
        return instance;
    }
    void SetText(String sth){
        this.stringValue = sth;
    }
    public String GetText() {
        return this.stringValue;
    }
}
