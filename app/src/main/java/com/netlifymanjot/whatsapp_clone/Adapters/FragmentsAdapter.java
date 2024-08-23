package com.netlifymanjot.whatsapp_clone.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.netlifymanjot.whatsapp_clone.Fragments.CallsFragments;
import com.netlifymanjot.whatsapp_clone.Fragments.ChatsFragments;
import com.netlifymanjot.whatsapp_clone.Fragments.StatusFragments;

public class FragmentsAdapter extends FragmentPagerAdapter
{
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ChatsFragments();
            case 1: return new StatusFragments();
            case 2: return new CallsFragments();
            default: return new ChatsFragments();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title = "CHATS";
        }
        if(position==1){
            title = "STATUS";
        }
        if(position==2){
            title = "CALLS";
        }
        return title;
    }
}
