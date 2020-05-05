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

        waterfallArray.add(new Location(getString(R.string.perwaghagh), getString(R.string.perwaghagh_address), R.drawable.perwaghaghfalss));
        waterfallArray.add(new Location(getString(R.string.lowerghaghrifalls), getString(R.string.lowerghaghrifalls_address), R.drawable.lowerghaghrifalls));
        waterfallArray.add(new Location(getString(R.string.dassamfalls), getString(R.string.dassamfalls_address), R.drawable.dassamfalls));
        waterfallArray.add(new Location(getString(R.string.hundrufalls), getString(R.string.hundrufalls_address), R.drawable.hundrufalls));
        waterfallArray.add(new Location(getString(R.string.sitafalls), getString(R.string.sitafalls_address), R.drawable.sitafalls));
        waterfallArray.add(new Location(getString(R.string.jonhafalls), getString(R.string.jonhafalls_address), R.drawable.jonhafalls));
        waterfallArray.add(new Location(getString(R.string.lodhwaterfalls), getString(R.string.lodhwaterfalls_address), R.drawable.lodhfalls));
        waterfallArray.add(new Location(getString(R.string.rajrappawaterfall), getString(R.string.rajrappawaterfall_address), R.drawable.rajrappawaterfalls));
        waterfallArray.add(new Location(getString(R.string.panchghaghfalls), getString(R.string.panchghaghfalls_address), R.drawable.panchghaghfalls));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), waterfallArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
