package com.example.android.miwok;

import android.widget.ImageView;

import static android.os.Build.ID;

/**
 * Created by Christos_Theodoropoulos on 7/4/17.
 * This class represents a vocabulary word that
 * the user wants to learn. It contains a default
 * translation and Miwok translation for that word.
 */

public class Word {

    // Default translation for the word.
    private String mDefaultTranslation;

    // Miwok translation for the word.
    private String mMiwokTranslation;

    // Image ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * First Constructor for Phrases.
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Second Constructor for Numbers, Colors, Family.
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get image resource id of the word.
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     *
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
