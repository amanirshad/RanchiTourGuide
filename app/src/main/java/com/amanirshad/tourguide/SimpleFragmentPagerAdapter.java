package com.amanirshad.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] tabTitles = new String[]{"Waterfalls", "Dams", "Tourist Places", "Restaurants"};

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return new WaterFallFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
