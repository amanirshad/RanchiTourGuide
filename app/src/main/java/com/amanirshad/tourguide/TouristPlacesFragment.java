package com.amanirshad.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristPlacesFragment extends Fragment {

    public TouristPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> touristPlaceArray = new ArrayList<Location>();

        touristPlaceArray.add(new Location(getString(R.string.patratuvalley), getString(R.string.patratu_address), R.drawable.patratuvalley));
        touristPlaceArray.add(new Location(getString(R.string.birsazoo), getString(R.string.zoo_address), R.drawable.birsazoologicalpark));
        touristPlaceArray.add(new Location(getString(R.string.ranchilake), getString(R.string.ranchilake_address), R.drawable.ranchilake));
        touristPlaceArray.add(new Location(getString(R.string.suntemple), getString(R.string.suntemple_address), R.drawable.suntemple));
        touristPlaceArray.add(new Location(getString(R.string.topchanchilake), getString(R.string.topchanchilake_address), R.drawable.topchanchilake));
        touristPlaceArray.add(new Location(getString(R.string.tagorehill), getString(R.string.tagorehill_address), R.drawable.tagorehill));
        touristPlaceArray.add(new Location(getString(R.string.paharimandir), getString(R.string.paharimandir_address), R.drawable.pahadimandir));
        touristPlaceArray.add(new Location(getString(R.string.funcastle), getString(R.string.funcastleaddress), R.drawable.funcastle));
        touristPlaceArray.add(new Location(getString(R.string.nucleusmall), getString(R.string.nucleusmall_address), R.drawable.nucleusmall));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), touristPlaceArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
