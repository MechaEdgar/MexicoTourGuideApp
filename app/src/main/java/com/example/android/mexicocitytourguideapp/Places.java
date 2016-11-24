package com.example.android.mexicocitytourguideapp;

/**
 * Created by ed on 23/11/2016.
 */

public class Places {

    //Name of the place
    private int mNameOfAttraction;

    //Direction of the place
    private int mDirectionOfAttraction;

    //Description of the place
    private int mDescriptionOfAttraction;

    //Image resource ID for the Place
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Defining the Places constructor with 3 strings and no int for ----- activities
     *
     * @param nameOfAttraction        is the name of the Place
     * @param directionOfAttraction   is the direction  of the Place
     * @param descriptionOfAttraction is the description of the Place
     */
    public Places(String nameOfAttraction, String directionOfAttraction, String descriptionOfAttraction) {
        mNameOfAttraction = nameOfAttraction;
        mDirectionOfAttraction = directionOfAttraction;
        mDescriptionOfAttraction = descriptionOfAttraction;
    }

    /**
     * Defining the Places constructor with 3 strings and 1 int for ----- activities
     *
     * @param nameOfAttraction        is the name of the Place
     * @param directionOfAttraction   is the direction  of the Place
     * @param descriptionOfAttraction is the description of the Place
     * @param imageResourceId         is the drawable resource ID for the asset
     **/
    public Places(String nameOfAttraction, String directionOfAttraction, String descriptionOfAttraction,
                  int imageResourceId) {
        mNameOfAttraction = nameOfAttraction;
        mDirectionOfAttraction = directionOfAttraction;
        mDescriptionOfAttraction = descriptionOfAttraction;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the Place name
     */
    public String getNameOfAttraction() {
        return mNameOfAttraction;
    }

    /**
     * Get the direction of the Place
     */
    public String getDirectionOfAttraction() {
        return mDirectionOfAttraction;
    }

    /**
     * Get the Description of the Place
     */
    public String getDescriptionOfAttraction() {
        return mDescriptionOfAttraction;
    }

    /**
     * Get the Image resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
    Returns wheter or not there is an image for this Place.
    @return boolean true or false
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
