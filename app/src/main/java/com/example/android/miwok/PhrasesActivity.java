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

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","ek"));
        words.add(new Word("two","doe"));
        words.add(new Word("three","tiin"));
        words.add(new Word("four","five"));
        words.add(new Word("five","paanch"));
        words.add(new Word("six","cheh"));
        words.add(new Word("seven","saat"));
        words.add(new Word("eight","aath"));
        words.add(new Word("nine","naou"));
        words.add(new Word("ten","dus"));
        words.add(new Word("eleven","igyaara"));
        words.add(new Word("twelve","baarah"));
        words.add(new Word("thirteen","terah"));
        words.add(new Word("fourteen","chouda"));
        words.add(new Word("fifteen","pandrah"));
        words.add(new Word("sixteen","solah"));
        words.add(new Word("seveteen","satrah"));
        words.add(new Word("eighteen","athrah"));
        words.add(new Word("nineteen","unnis"));
        words.add(new Word("twenteen","bis"));

        // Create an {@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource and for getting the view we overriden
        // the getView method
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_phrases);

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
