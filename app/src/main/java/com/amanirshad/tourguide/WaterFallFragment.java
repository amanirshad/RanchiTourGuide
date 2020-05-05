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
public class WaterFallFragment extends Fragment {

    public WaterFallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> waterfallArray = new ArrayList<Location>();

        waterfallArray.add(new Location("Perwaghagh", "Khunti,Torpa,Jharkhand", R.drawable.perwaghaghfalss));
        waterfallArray.add(new Location("Lower Ghaghri Falls", "Latehar,Netarhat,Jharkhand", R.drawable.lowerghaghrifalls));
        waterfallArray.add(new Location("Dassam Falls", "Taimara,Bundu,Jharkhand", R.drawable.dassamfalls));
        waterfallArray.add(new Location("Hundru Falls", "Faul,Hundru,Jharkhand", R.drawable.hundrufalls));
        waterfallArray.add(new Location("Sita Falls", "Dumargarhi,Jharkhand", R.drawable.sitafalls));
        waterfallArray.add(new Location("Jonha Falls", "Ranchi-Purulia Highway,Jonha,Jharkhand", R.drawable.jonhafalls));
        waterfallArray.add(new Location("Lodh Watefalls", "Palamu,Latehar,Jharkhand", R.drawable.lodhfalls));
        waterfallArray.add(new Location("Rajrappa Waterfalls", "Ramgarh,Jharkhand", R.drawable.rajrappawaterfalls));
        waterfallArray.add(new Location("Panchghagh Waterfalls", "Khunti,Jharkhand", R.drawable.panchghaghfalls));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), waterfallArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
