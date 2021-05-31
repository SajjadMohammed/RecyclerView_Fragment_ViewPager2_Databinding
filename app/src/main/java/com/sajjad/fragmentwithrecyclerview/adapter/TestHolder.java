package com.sajjad.fragmentwithrecyclerview.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.fragmentwithrecyclerview.databinding.TestItemBinding;

public class TestHolder extends RecyclerView.ViewHolder {

    TestItemBinding recyclerItemBinding;

    public TestHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
        super(itemView);
        recyclerItemBinding = DataBindingUtil.bind(itemView);
    }
}