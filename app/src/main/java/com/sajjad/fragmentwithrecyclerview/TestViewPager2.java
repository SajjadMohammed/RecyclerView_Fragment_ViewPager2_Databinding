package com.sajjad.fragmentwithrecyclerview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class TestViewPager2 extends FragmentStateAdapter {

    private final int length;

    public TestViewPager2(@NonNull @NotNull FragmentActivity fragmentActivity, int length) {
        super(fragmentActivity);
        this.length = length;
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return new TestFragment(position);
//        return TestFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return length;
    }
}