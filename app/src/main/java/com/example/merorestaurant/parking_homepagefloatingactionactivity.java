package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class parking_homepagefloatingactionactivity extends AppCompatActivity {


    FloatingActionMenu floatingActionMenu;
    FloatingActionButton car, bike, viewAllvehicle;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_homepage);

        floatingActionMenu = (FloatingActionMenu) findViewById(R.id.floatingmenu);
        car = (FloatingActionButton)findViewById(R.id.floatingactioncar);
        bike = (FloatingActionButton)findViewById(R.id.floatingactionbike);
        viewAllvehicle= (FloatingActionButton) findViewById(R.id.floatingactionall);


        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parking_homepagefloatingactionactivity.this,
                        parking_details_page_activity.class);
                startActivity(intent);
            }
        });

        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parking_homepagefloatingactionactivity.this,
                        parking_details_page_activity.class);
                startActivity(intent);
            }
        });
        viewAllvehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parking_homepagefloatingactionactivity.this,
                        parking_details_page_activity.class);
                startActivity(intent);
            }
        });


    }




}


