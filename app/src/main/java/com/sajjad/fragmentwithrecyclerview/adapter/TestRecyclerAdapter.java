package com.sajjad.fragmentwithrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.fragmentwithrecyclerview.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestHolder> {

    List<Test> tests;
    Context context;

    public TestRecyclerAdapter(List<Test> tests, Context context) {
        this.tests = tests;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public TestHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.test_item, parent, false).getRoot();
        return new TestHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull TestHolder holder, int position) {
        holder.recyclerItemBinding.setTest(tests.get(position));
    }

    @Override
    public int getItemCount() {
        return tests.size();
    }
}