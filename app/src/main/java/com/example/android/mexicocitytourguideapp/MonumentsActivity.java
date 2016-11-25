package com.example.android.mexicocitytourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        ArrayList<Places> placesList = new ArrayList<Places>();
        placesList.add(new Places(R.string.monument1,R.string.address1,R.string.description1,R.drawable.maxresdefault));
        placesList.add(new Places(R.string.monument2,R.string.address2,R.string.description2,R.drawable.angeldelainde));
        placesList.add(new Places(R.string.monument3,R.string.address3,R.string.description3,R.drawable.monumentoajuarez));


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
/*
Este comentario es una prueba!
 */