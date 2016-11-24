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
        placesList.add(new Places("Monumento a la Revolucion",
                "Address: Plaza de la República S/N,Tabacalera",
                "El monumento a la Revolucíon es una obra arquitectonica y un mausoleo dedicado" +
                        "a la conmemoracion de la Revolucion Mexicana.",R.mipmap.ic_launcher));
       /* placesList.add(new Places("Angel de la independencia",
                "Address:Paseo de la reforma y Eje 2PTE",
                "El monumento a la independencia,conocido popularmente como el Angel,se encuentra en la ciudad de" +
                        "México , en la glorieta localizada en la confluencia de Paseo de la Reforma"));
        placesList.add(new Places("Hemiciclo a Juárez",
                "Address: Av.Juárez s/n, Cuauhtémoc,Centro",
                "El Hemiciclo a Juárez es un canotafio de la Ciudad de México, ubivado en la Alameda Central del" +
                        "Centro Histórico")); */

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
