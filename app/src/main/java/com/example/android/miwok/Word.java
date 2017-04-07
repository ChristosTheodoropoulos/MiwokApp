package com.example.android.miwok;

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

    // Constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
