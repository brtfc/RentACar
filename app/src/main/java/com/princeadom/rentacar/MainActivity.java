package com.princeadom.rentacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void listRentalCompanies(View view){
        Intent rentCompaniesList = new Intent(MainActivity.this, rentalCompanies.class);
        startActivity(rentCompaniesList);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
