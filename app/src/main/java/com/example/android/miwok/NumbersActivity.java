package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words.
        ArrayList<Word> words = new ArrayList<Word>();

        // Create new objects of class Word
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

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
