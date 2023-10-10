package com.example.drip_no_more;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Gearswitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gearswitch);
        Intent i = getIntent();
        String message = i.getStringExtra("needed");
    }
    public void handleTextThenGoBack(View v){
        EditText editText = (EditText) findViewById(R.id.editTextText);
        String edit = editText.toString();
        Intent i = getIntent();
        String changer = i.getStringExtra("theId");
        Intent back = new Intent(this, MainActivity.class);
        Integer idtochange = Integer.valueOf(i.getStringExtra("theId"));
        Bundle extras = new Bundle();
        extras.putString("edit", edit);
        extras.putInt("idtochange", idtochange);
        back.putExtras(extras);
        startActivity(back);
    }
    public void abandon(View v){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}