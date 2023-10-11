package com.example.drip_no_more;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Arrays;

public class Gearswitch extends AppCompatActivity{
    public ChangeTheText sentence = new ChangeTheText();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gearswitch);
    }
    public void handleTextThenGoBack(View v){
        EditText editText = (EditText) findViewById(R.id.editTextText);
        sentence.SetText(editText.toString());
        Log.d("Idtouse", "Finished Bitch imma go back");
        finish();
    }
    public void abandon(View v){
        finish();
    }
}