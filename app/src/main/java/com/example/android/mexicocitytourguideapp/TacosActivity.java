package com.example.android.mexicocitytourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TacosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        ArrayList<Places> placesList = new ArrayList<Places>();
        placesList.add(new Places(R.string.tacos1,R.string.tacosAddress1,R.string.tacosDescription1));
        placesList.add(new Places(R.string.tacos2,R.string.tacosAddress2,R.string.tacosDescription2));
        placesList.add(new Places(R.string.tacos3,R.string.tacosAddress3,R.string.tacosDescription3));
        placesList.add(new Places(R.string.tacos4,R.string.tacosAddress4,R.string.tacosDescription4));
        placesList.add(new Places(R.string.tacos5,R.string.tacosAddress5,R.string.tacosDescription5));


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
