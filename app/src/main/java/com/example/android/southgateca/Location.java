package com.example.android.southgateca;

public class Location {
    private int mName;
    private int mType;
    private int mImageResourceId;
    private int mDescription;


    public Location(int name, int type, int imageResourceId, int description){
        mName = name;
        mType = type;
        mImageResourceId = imageResourceId;
        mDescription = description;
    }

    public int getName(){
        return mName;
    }

    public int getType(){
        return mType;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getDescription(){
        return mDescription;
    }
}
