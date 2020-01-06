package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class restaurant_itemselection_page extends AppCompatActivity {


    Button selectItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_itemsselection_page);


        selectItem = (Button) findViewById(R.id.selectItem_btn);

        selectItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurant_itemselection_page.this,item_counter_restaurant.class);
                startActivity(intent);
            }
        });





    }
}
