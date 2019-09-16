package com.tajwar.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mtimeInMilliseconds;
    private String murl;


    public Earthquake (double ipMagnitude, String ipLocation, long timeInMilliseconds, String url){
        mMagnitude = ipMagnitude;
        mLocation = ipLocation;
        //mDate = ipDate;
        mtimeInMilliseconds = timeInMilliseconds;
        murl = url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }
/**
    public String getmDate() {
        return mDate;
    }
 */

    public long gettimeInMilliseconds(){
        return mtimeInMilliseconds;
    }

    public String getMurl() {
        return murl;
    }
}
