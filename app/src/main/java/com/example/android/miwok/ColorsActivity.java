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

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","laal",R.drawable.color_red));
        words.add(new Word("green","hara",R.drawable.color_green));
        words.add(new Word("black","kaala",R.drawable.color_black));
        words.add(new Word("dusty yellow","gehra pila",R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","halka pila",R.drawable.color_mustard_yellow));
        words.add(new Word("brown","bhura",R.drawable.color_brown));
        words.add(new Word("gray","dhoosar",R.drawable.color_gray));
        words.add(new Word("white","safed",R.drawable.color_white));
        // Create an {@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource and for getting the view we overriden
        // the getView method
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);
    }
}
