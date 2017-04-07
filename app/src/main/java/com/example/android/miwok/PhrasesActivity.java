package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words.
        ArrayList<Word> words = new ArrayList<Word>();

        // Create new objects of class Word
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

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
