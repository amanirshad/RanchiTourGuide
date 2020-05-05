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
public class DamFragment extends Fragment {

    public DamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> damArray = new ArrayList<Location>();

        damArray.add(new Location("Kanke Dam", "Kanke,Ranchi,Jharkhand", R.drawable.kankedams));
        damArray.add(new Location("Dhurwa Dam", "Dhurwa,Ranchi,Jharkhand", R.drawable.dhurwadam));
        damArray.add(new Location("Getalsud Dam", "Kanke,Ranchi,Jharkhand", R.drawable.getalsuddam));
        damArray.add(new Location("Rukka Dam", "Ormanjhi,Ranchi,Jharkhand", R.drawable.rukkadam));
        damArray.add(new Location("Patratu Dam", "Patratu,Jharkhand", R.drawable.patratudam));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), damArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
