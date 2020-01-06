package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.merorestaurant.Authenticiation.LoginActivity;

public class options_activity extends AppCompatActivity {

    Button restaurant, logistics, parking ;
    ImageView optionsdehaze;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_page);

        restaurant = (Button) findViewById(R.id.restaurant);
        logistics= (Button) findViewById(R.id.logistics);
        parking=(Button) findViewById(R.id.parking);
        optionsdehaze= (ImageView) findViewById(R.id.Optionsdehaze);


        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(options_activity.this, restaurant_home_page.class);
                startActivity(intent);
            }
        });

        optionsdehaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(options_activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
