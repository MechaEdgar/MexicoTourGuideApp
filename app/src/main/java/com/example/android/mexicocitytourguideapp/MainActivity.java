package com.example.android.mexicocitytourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the monuments category
        TextView monuments = (TextView) findViewById(R.id.monuments);

        //Set a clickListener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a Toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the list of monuments", Toast.LENGTH_SHORT).show();
                //Create a new intent to open{@link MonumentsActivity}
                Intent monumentsIntent = new Intent(MainActivity.this,
                        MonumentsActivity.class);

                //Start the new activity
                startActivity(monumentsIntent);
            }
        });

        //Find the View that shows the tacos category
        TextView tacos = (TextView) findViewById(R.id.tacos);

        //Set a clickListener on that View
        tacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a Toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the tacos category", Toast.LENGTH_SHORT).show();
                //Create a new intent to open{@link TacosActivity}
                Intent tacosIntent = new Intent(MainActivity.this,
                        TacosActivity.class);
                //Start the new activity
                startActivity(tacosIntent);
            }
        });

        //Find the View that shows the museums category
        TextView museums = (TextView) findViewById(R.id.museums);

        //Set a clickListener on that view
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a Toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the museums category", Toast.LENGTH_SHORT).show();
                //Create a new intent to open {@link MuseumActivity}
                Intent museumIntent = new Intent(MainActivity.this,
                        MuseumActivity.class);
                //Start the activity
                startActivity(museumIntent);
            }
        });

        //Find the view that shows the bakeries activity
        TextView bakery = (TextView) findViewById(R.id.bakeries);

        //Set a clickListener on that view
        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a Toast that shows what activity are you opening
                Toast.makeText(v.getContext(),"Open the bakeries category",Toast.LENGTH_SHORT).show();
                //Create a new intent to open {@link BakeriesActivity}
                Intent bakeriesIntent = new Intent(MainActivity.this,
                        BakeriesActivity.class);
                //Start the activity
                startActivity(bakeriesIntent);
            }
        });

    }
}
