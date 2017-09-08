package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("mother","maa",R.drawable.family_mother));
        words.add(new Word("father","pita shri",R.drawable.family_father));
        words.add(new Word("daughter","beti",R.drawable.family_daughter));
        words.add(new Word("son","beta",R.drawable.family_son));
        words.add(new Word("grandfather","dada ji",R.drawable.family_grandfather));
        words.add(new Word("grandmother","dadi ji",R.drawable.family_grandmother));
        words.add(new Word("elder brother","bhaiya",R.drawable.family_older_brother));
        words.add(new Word("younger brother","bhai",R.drawable.family_younger_brother));
        words.add(new Word("elder sister","didi",R.drawable.family_older_sister));
        words.add(new Word("younger sister","behen",R.drawable.family_younger_sister));
        words.add(new Word("younger brother","chota bhai",R.drawable.family_younger_brother));
        // Create an {@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource and for getting the view we overriden
        // the getView method
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);
    }
}
