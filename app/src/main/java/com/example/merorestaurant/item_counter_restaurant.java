package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class item_counter_restaurant extends AppCompatActivity {


    TextView ChickenMomo;
    Button increase, decrease;
    int counter = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_item_counter);


        ChickenMomo = (TextView) findViewById(R.id.cMomo);
        increase = (Button) findViewById(R.id.increase);
        decrease = (Button) findViewById(R.id.decrease);


    }

    public void countIn(View view) {

        counter++ ;
        ChickenMomo.setText(Integer.toString(counter));
    }

    public void countDE(View v) {

        counter-- ;
        ChickenMomo.setText(Integer.toString(counter));
    }


}
