package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words.
        ArrayList<Word> words = new ArrayList<Word>();

        // Create new objects of class Word
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));

        /**
         * Create a word adapter, whose data source is a list of Words.
         * This list item layout contains two TextViews,
         * which the adapter will set to display a single word
         * (default and miwok translation).
         */
        WordAdapter adapter = new WordAdapter(this, words);

        /**
         * Find the ListView object in the view hierarchy of the activity_numbers.
         * There should be a ListView with the view ID called list, which is
         * declared in word_list.xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /**
         * Make the ListView use the Adapter we created above,
         * so that the ListView will display list items for each word
         * in the list of words. Do this by calling the setAdapter
         * method on the ListView object and pass in 1 argument, which
         * is the Adapter with the variable name adapter.
         */
        listView.setAdapter(adapter);
    }
}
