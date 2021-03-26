package com.example.bcs6a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VIewPagerAdapter extends FragmentPagerAdapter {
    public VIewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new callFragment();
            case 1:
                return new msgFragment();
            case 2:
                return new chatFragment();
        }
        return new callFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
         super.getPageTitle(position);
         String title = null;
         if (position==0){
             title="Calls";

         }
         if (position==1){
             title="status";
         }
         if (position==2) {
             title="massege";

         }
         return title;


    }
}
