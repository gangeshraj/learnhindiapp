package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;
import java.util.ArrayList;
/**
 * Created by gangesh raj on 8/7/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //resource id for different background colors of different lists
    private int mcolorresourceid;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorresourceid) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mcolorresourceid=colorresourceid;
    }
    //Auto generated when overriden from above option "Code"
    //it is overriden and it must be overriden because arrayAdapter is meant for single TextView
    //for complex views it need to be overriden see the documentation
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the translation from the current currentWord object using the word public method and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the translation from the current currentWord object using the word public method and
        // set this text on the name TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image) ;
         // Get the image from the current currentWord object using the word public method and
         // set this image on the name ImageView
        if(currentWord.hasImage())
        {
            defaultImageView.setImageResource(currentWord.getImageResourceId());
            defaultImageView.setVisibility(View.VISIBLE); //making sure the view is visible
        }
        else
            defaultImageView.setVisibility(View.GONE); //making sure the view is invisible and
        // also not talking space if View.INVISSIBLE was there than image would have been invisible
        //but still taken space

        //set the theme color for the list item
        View textContainer=listItemView.findViewById(R.id.text_container);
        //find the color that resource id maps to
        int color= ContextCompat.getColor(getContext(),mcolorresourceid);
        //set background color of text view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}