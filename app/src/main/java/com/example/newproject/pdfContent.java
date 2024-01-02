package com.example.newproject;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;

public class pdfContent extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    MaterialButton btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_content);

        // This Code for Drawer or toolbar  open and close
        drawerLayout = findViewById(R.id.drawer_layout1);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pdfContent.this, pdfviewer1.class);
                startActivity(intent);
                finish();
            }
        });

        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pdfContent.this, pdfviewer.class);
                startActivity(intent);
                finish();
            }
        });

        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pdfContent.this, pdfviewer2.class);
                startActivity(intent);
                finish();

            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(pdfContent.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}