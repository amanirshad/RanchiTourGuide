package com.amanirshad.tourguide;

public class Location {

    private int mImageResourceId;

    private String mLocationName;

    private String mLocationAddress;

    public Location(String locationName, String locationAddress) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    public Location(String locationName, String locationAddress, int imageResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }
}
