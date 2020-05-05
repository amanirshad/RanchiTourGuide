package com.amanirshad.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getLocationName());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.location_address);
        locationAddress.setText(currentLocation.getLocationAddress());

        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.location_image);
        if (locationImage.getVisibility() == View.VISIBLE) {
            locationImage.setImageResource(currentLocation.getImageResourceId());
        } else {
            locationImage.setVisibility(View.INVISIBLE);
        }

        return listItemView;
    }
}
