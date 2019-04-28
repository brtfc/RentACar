package com.princeadom.rentacar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class rentalCompanies extends AppCompatActivity {

    ListView rentalCompanieslist;

    public String[] rentalCompanies = {"ACE Rent A Car", "Hertz", "Budget Car Rental", "Dollar Rent A Car", "Alamo Rent A Car", "Enterprise Rent A Car"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_companies);
        //set the title of this activity
        this.setTitle("Car Rental Companies");

        rentalCompanieslist = findViewById(R.id.rentalCompanies_lstViewID);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.custom_layout, rentalCompanies);

        rentalCompanieslist.setAdapter(arrayAdapter);

        rentalCompanieslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acerentacar.com/googleplacesppc.aspx?url=/landing/New-Jersey/Elizabeth/Newark-Intl-Airport.aspx")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hertz.com/rentacar/location/unitedstates/newjersey/maplewood/ewrw21")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/en/locations/us/nj/newark/ewr")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dollar.com/")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com/en_US/car-rental/locations/us/ewrt71-newark-liberty-international-airport.html?mcid=yext:245709")));
                        break;
                    case 5:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/en/car-rental/locations/us/nj/hillside-24v9.html?mcid=yext:245709")));
                        break;
                }
            }
        });

    }
}
