package com.sajjad.fragmentwithrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.tabs.TabLayoutMediator;
import com.sajjad.fragmentwithrecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    final String[] tabTitles = {"Group1", "Group2", "Group3", "Group4", "Group5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //
        binding.viewPager2.setAdapter(new TestViewPager2(this, tabTitles.length));
        new TabLayoutMediator(binding.tabLayout, binding.viewPager2,
                (tab, position) -> tab.setText(tabTitles[position]))
                .attach();
    }
}