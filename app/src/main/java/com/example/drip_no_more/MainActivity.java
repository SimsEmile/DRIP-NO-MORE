package com.example.drip_no_more;

import android.content.Intent;
import android.os.Bundle;
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

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent bb = getIntent();
        Bundle extras = bb.getExtras();
        if (" " != bb.getStringExtra("edit")){
            Integer buttontochange = extras.getInt("idtochange");
            String editing = extras.getString("edit");
            Button ButtonID = (Button) findViewById(buttontochange);
            ButtonID.setText(editing);
        }

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

    }
    public <Button> void ChangeActivities(View v){
        Button btn = (Button)v;  // v is the Button that was clicked so cast it to a Button
        String theId = String.valueOf(v.getId());
        String needed = v.getResources().getResourceName(v.getId());
        Intent i =  new Intent(this, Gearswitch.class);
        i.putExtra(needed, theId);   // then send it on its way
        startActivity(i);
    }

}