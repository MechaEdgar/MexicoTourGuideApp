package com.example.android.mexicocitytourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BakeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        ArrayList<Places> placesList = new ArrayList<Places>();
        placesList.add(new Places(R.string.bakery1,R.string.bakeryAddress1,R.string.bakeryDescription1));
        placesList.add(new Places(R.string.bakery2,R.string.bakeryAddress2,R.string.bakeryDescription2));
        placesList.add(new Places(R.string.bakery3,R.string.bakeryAddress3,R.string.bakeryDescription3));
        placesList.add(new Places(R.string.bakery4,R.string.bakeryAddress4,R.string.bakeryDescription4));


        //Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}
        //The adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(this, placesList);


        /*Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        There should be a {@link ListView} with the view ID called list, wich is declared in
        attractions_list.xml layout file
         */
        ListView ListView = (ListView) findViewById(R.id.list);

        /*
        Make the {@link ListView} use the {@link PlacesAdapter} we created, so that the
        {@link ListView} will display list items for each {@link Places} in the list.
         */
        ListView.setAdapter(adapter);
    }
}
