package com.example.merorestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class parking_details_page_activity extends AppCompatActivity {



    ImageView parkingdehze;
    EditText vehicle_no , time ;
    Button submit ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_details_page);


        vehicle_no =(EditText) findViewById(R.id.vehicle_number);
        time =(EditText) findViewById(R.id.time_enter);
        submit =(Button) findViewById(R.id.submit_btn);
        parkingdehze = (ImageView) findViewById(R.id.ParkingDetailsdehaze);



        parkingdehze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parking_details_page_activity.this,
                        parking_homepagefloatingactionactivity.class);
                startActivity(intent);
            }
        });





    }

}
