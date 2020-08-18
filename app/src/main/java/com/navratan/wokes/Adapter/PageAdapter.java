package com.navratan.wokes.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.navratan.wokes.About;
import com.navratan.wokes.Privacy;
import com.navratan.wokes.Refund;
import com.navratan.wokes.Terms;

public class PageAdapter extends FragmentPagerAdapter {


    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new About();
            case 1:
                return new Privacy();
            case 2:
                return new Refund();
            case 3:
                return new Terms();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}