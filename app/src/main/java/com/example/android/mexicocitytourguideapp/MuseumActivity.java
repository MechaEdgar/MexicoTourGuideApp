package com.example.android.mexicocitytourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);
        ArrayList<Places> placesList = new ArrayList<Places>();
        placesList.add(new Places(R.string.museums1, R.string.museumsAddress1, R.string.museumsDescription1));
        placesList.add(new Places(R.string.museums2, R.string.museumsAddress2, R.string.museumsDescription2));
        placesList.add(new Places(R.string.museums3, R.string.museumsAddress3, R.string.museumsDescription3));
        placesList.add(new Places(R.string.museums4, R.string.museumsAddress4, R.string.museumsDescription4));
        placesList.add(new Places(R.string.museums5, R.string.museumsAddress5, R.string.museumsDescription5));

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
