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
public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> diningArray = new ArrayList<Location>();

        diningArray.add(new Location(getString(R.string.lsd), getString(R.string.lsd_address), R.drawable.lsdranchi));
        diningArray.add(new Location(getString(R.string.motimahal), getString(R.string.motimahal_address), R.drawable.motimahal));
        diningArray.add(new Location(getString(R.string.flykitchen), getString(R.string.churchcomplex_address), R.drawable.flkitchen));
        diningArray.add(new Location(getString(R.string.kathikabab), getString(R.string.kathikabab_address), R.drawable.kathikabab));
        diningArray.add(new Location(getString(R.string.kaveri), getString(R.string.churchcomplex_address), R.drawable.kaveri));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), diningArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
