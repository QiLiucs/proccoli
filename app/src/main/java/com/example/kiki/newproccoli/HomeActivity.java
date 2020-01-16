package com.example.kiki.newproccoli;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navBar = findViewById(R.id.navigation);
        navBar.inflateMenu(R.menu.menu_bottomnavigation);
    }


}
