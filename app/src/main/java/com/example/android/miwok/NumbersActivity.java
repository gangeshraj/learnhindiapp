/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","ek",R.drawable.number_one));
        words.add(new Word("two","doe",R.drawable.number_two));
        words.add(new Word("three","tiin",R.drawable.number_three));
        words.add(new Word("four","five",R.drawable.number_four));
        words.add(new Word("five","paanch",R.drawable.number_five));
        words.add(new Word("six","cheh",R.drawable.number_six));
        words.add(new Word("seven","saat",R.drawable.number_seven));
        words.add(new Word("eight","aath",R.drawable.number_eight));
        words.add(new Word("nine","naou",R.drawable.number_nine));
        words.add(new Word("ten","dus",R.drawable.number_ten));
        // Create an {@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource and for getting the view we overriden
        // the getView method
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_numbers);

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