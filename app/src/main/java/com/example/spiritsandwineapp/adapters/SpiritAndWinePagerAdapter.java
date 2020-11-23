package com.example.spiritsandwineapp.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.spiritsandwineapp.models.Brew;
import com.example.spiritsandwineapp.ui.SpiritsAndWineDetailsFragment;


import java.util.List;

public class SpiritAndWinePagerAdapter extends FragmentPagerAdapter {
    private List<Brew> mBrews;
    public SpiritAndWinePagerAdapter(FragmentManager fm, int behavior, List<Brew> brews) {
        super(fm, behavior);
        mBrews = brews;
    }
    @Override
    public Fragment getItem(int position) {
        return SpiritsAndWineDetailsFragment.newInstance(mBrews.get(position));
    }
    @Override
    public int getCount() {
        return mBrews.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mBrews.get(position).getName();
    }
}