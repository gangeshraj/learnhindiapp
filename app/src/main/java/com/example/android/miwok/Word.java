package com.example.android.miwok;

/**
 * Created by gangesh raj on 8/7/2017.
 */

public class Word {
    //all class variables are private and this should be done so no other class can access it and
    //change it and our app might crash
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    //negative value so that it not clashes with any resource id
    private static final int NO_IMAGE=-1;
    private int mImageResourceId=NO_IMAGE;

    //below we are doing constructor overloading
    public Word(String defaultTranslation,String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    public Word(String defaultTranslation,String miwokTranslation,int ImageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=ImageResourceId;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){return mImageResourceId ; }
    //returning true below
    public boolean hasImage(){ return mImageResourceId!=NO_IMAGE; }
}
