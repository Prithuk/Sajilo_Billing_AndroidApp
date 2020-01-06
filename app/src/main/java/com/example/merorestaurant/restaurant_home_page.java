package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.merorestaurant.R;

public class restaurant_home_page extends AppCompatActivity {



    TextView table1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_home_page);


        table1 = (TextView) findViewById(R.id.table1);


        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurant_home_page.this,
                        restaurant_itemselection_page.class);
                startActivity(intent);
            }
        });


    }
}
