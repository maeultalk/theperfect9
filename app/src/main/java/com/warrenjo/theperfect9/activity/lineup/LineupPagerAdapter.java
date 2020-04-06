package com.warrenjo.theperfect9.activity.lineup;


import com.warrenjo.theperfect9.activity.lineup.batter.BatterLineupFragment;
import com.warrenjo.theperfect9.activity.lineup.pitcher.PitcherLineupFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class LineupPagerAdapter extends FragmentPagerAdapter {

    private Fragment batterLineupFragment, pitcherLineupFragment;

    public LineupPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
//            return PlaceholderFragment.newInstance(position + 1);

        switch (position) {
            case 0:
                if(batterLineupFragment == null) {
                    batterLineupFragment = new BatterLineupFragment();
                    return batterLineupFragment;
                } else {
                    return batterLineupFragment;
                }
            case 1:
                if(pitcherLineupFragment == null) {
                    pitcherLineupFragment = new PitcherLineupFragment();
                    return pitcherLineupFragment;
                } else {
                    return pitcherLineupFragment;
                }
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }


}
