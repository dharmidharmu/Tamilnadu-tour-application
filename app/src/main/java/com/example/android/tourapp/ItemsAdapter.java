package com.example.android.tourapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ItemsAdapter extends FragmentPagerAdapter {

    ItemsAdapter(FragmentManager fm) {
        super(fm);
    }

    // Assign the number of fragments
    @Override
    public int getCount() {
        return 2;
    }

    // Get necessary fragment according to its position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BudgetFragment();

            case 1:
                return new ExpensiveFragment();
        }
        return null;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Budget";
            case 1:
                return "Expensive";
        }
        return null;
    }
}
