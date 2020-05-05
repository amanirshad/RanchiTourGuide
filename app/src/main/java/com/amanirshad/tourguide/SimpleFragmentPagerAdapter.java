package com.amanirshad.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] tabTitles = new String[]{"Waterfalls", "Dams", "Tourist Places", "Dining"};

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new WaterFallFragment();
        if (position == 1)
            return new DamFragment();
        if (position == 2)
            return new TouristPlacesFragment();
        else
            return new DiningFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
