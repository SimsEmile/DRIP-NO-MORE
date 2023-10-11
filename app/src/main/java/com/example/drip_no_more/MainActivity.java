package com.example.drip_no_more;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.drip_no_more.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private String ButtonPressed= "";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Jules", "ik ben hier");
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        Log.d("Jules", "nog steeds hier");
    }
    public void ChangeActivities(View v){
        Intent i =  new Intent(this, Gearswitch.class);
        ButtonPressed = v.getTag().toString();
        Log.d("Idtouse", String.valueOf(ButtonPressed));
        startActivity(i);

    }
    @Override
    protected void onResume() {
        Log.d("Jules", "finally here");
        Log.d("Idtouse", String.valueOf(ButtonPressed));
        super.onResume();
        String finaltext = ChangeTheText.getInstance().GetText();
        Log.d("finaltext", finaltext);
        if (ButtonPressed == findViewById(R.id.Button1).getTag().toString()) {
            Log.d("Idtouse", findViewById(R.id.Button1).getTag().toString());
            Button btn1 = findViewById(R.id.Button1);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }
        else if (ButtonPressed == findViewById(R.id.Button2).getTag().toString()) {
            Button btn1 = findViewById(R.id.Button2);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }
        else if (ButtonPressed == findViewById(R.id.Button3).getTag().toString()) {
            Button btn1 = findViewById(R.id.Button3);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }
        else if (ButtonPressed == findViewById(R.id.Button4).getTag().toString()) {
            Button btn1 = findViewById(R.id.Button4);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }
        else if (ButtonPressed == findViewById(R.id.Button5).getTag().toString()) {
            Button btn1 = findViewById(R.id.Button5);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }
        else if (ButtonPressed == findViewById(R.id.Button6).getTag().toString()){
            Button btn1 = findViewById(R.id.Button6);
            btn1.setText(finaltext);
            btn1.requestLayout();
            String sth = btn1.getText().toString();
            Log.d("Textbitch", sth);
        }

        Log.d("Jules", "ik ben hier");
    }
}