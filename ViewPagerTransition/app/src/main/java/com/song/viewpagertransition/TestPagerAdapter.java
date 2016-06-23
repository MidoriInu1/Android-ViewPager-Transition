package com.song.viewpagertransition;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TestPagerAdapter extends FragmentStatePagerAdapter {

    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return position==0?new FrontFragment():new BackFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    public static class FrontFragment extends Fragment {
        public FrontFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_front, container, false);
        }
    }


    public static class BackFragment extends Fragment {
        public BackFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_back, container, false);
        }
    }
}

