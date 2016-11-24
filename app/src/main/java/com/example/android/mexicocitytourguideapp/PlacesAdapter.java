package com.example.android.mexicocitytourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ed on 23/11/2016.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Activity context, ArrayList<Places> places){
        super(context,0,places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if the existing view is beign reused, otherwhise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the {@link Place} object located at this position in the list
        Places currentPlace = getItem(position);

        //Find the TextView in the list_itemut with the id name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        //Get the name from the current Places object and set this text on the monuments Textview
        nameTextView.setText(currentPlace.getNameOfAttraction());

        //Find the TextView in the list_itemut with the id name
        TextView directionTextView = (TextView) listItemView.findViewById(R.id.direction);
        //Get the name from the current Places object and set this text on the monuments Textview
        directionTextView.setText(currentPlace.getDirectionOfAttraction());

        //Find the TextView in the list_itemut with the id name
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        //Get the name from the current Places object and set this text on the monuments Textview
        descriptionTextView.setText(currentPlace.getDescriptionOfAttraction());

        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.picture);
        if(currentPlace.hasImage()) {
            //Get the version number from the current Word object and
            //set this image ton the Textview
            imageView.setImageResource(currentPlace.getImageResourceId());
        }else{
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout so that can be shown in the ListView
        return listItemView;
    }
}
