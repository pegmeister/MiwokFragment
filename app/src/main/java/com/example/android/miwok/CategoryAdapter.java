package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide layout for
 * each list item based on a data source which is a list of {@link Word} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitle[] = new String[]{"Numbers", "Family", "Colors","Phrases"};
    private Context context;

    /**
     * create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is a fragment manager that will keep each fragment's state in
     *           the adapter across swipes.
     */
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    /**
     * return the total number of pages
     */

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Generate title based on item position
        return tabTitle[position];

    }
}
