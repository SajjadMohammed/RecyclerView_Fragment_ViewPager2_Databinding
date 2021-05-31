package com.sajjad.fragmentwithrecyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.sajjad.fragmentwithrecyclerview.adapter.Test;
import com.sajjad.fragmentwithrecyclerview.adapter.TestRecyclerAdapter;
import com.sajjad.fragmentwithrecyclerview.databinding.TestFragmentBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TestFragment extends Fragment {

    TestFragmentBinding binding;

    public TestFragment(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        setArguments(bundle);
    }

//    public static TestFragment newInstance(int position) {
//        Bundle bundle = new Bundle();
//        bundle.putInt("position", position);
//        //
//        TestFragment testFragment = new TestFragment();
//        testFragment.setArguments(bundle);
//        return testFragment;
//    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        //
        return DataBindingUtil.inflate(inflater, R.layout.test_fragment, container, false).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //
        binding = DataBindingUtil.bind(view);
        //
        TestRecyclerAdapter testRecyclerAdapter = new TestRecyclerAdapter(getTestsByGroup(), getContext());
        binding.testRecycler.setHasFixedSize(true);
        binding.testRecycler.setAdapter(testRecyclerAdapter);
    }

    private List<Test> getTestsByGroup() {

        if (getArguments() != null) {
            switch (getArguments().getInt("position")) {
                case 0:
                    return getGroup1Tests();
                case 1:
                    return getGroup2Tests();
                case 2:
                    return getGroup3Tests();
                case 3:
                    return getGroup4Tests();
                default:
                    return getGroup5Tests();
            }
        }
        return null;
    }

    private List<Test> getGroup1Tests(){
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("Test1","TestSubtitle"));
        tests.add(new Test("Test1","TestSubtitle"));
        tests.add(new Test("Test1","TestSubtitle"));
        tests.add(new Test("Test1","TestSubtitle"));
        tests.add(new Test("Test1","TestSubtitle"));
        return tests;
    }

    private List<Test> getGroup2Tests(){
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("Test2","TestSubtitle"));
        tests.add(new Test("Test2","TestSubtitle"));
        tests.add(new Test("Test2","TestSubtitle"));
        tests.add(new Test("Test2","TestSubtitle"));
        tests.add(new Test("Test2","TestSubtitle"));
        return tests;
    }

    private List<Test> getGroup3Tests(){
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("Test3","TestSubtitle"));
        tests.add(new Test("Test3","TestSubtitle"));
        tests.add(new Test("Test3","TestSubtitle"));
        tests.add(new Test("Test3","TestSubtitle"));
        tests.add(new Test("Test3","TestSubtitle"));
        return tests;
    }

    private List<Test> getGroup4Tests(){
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("Test4","TestSubtitle"));
        tests.add(new Test("Test4","TestSubtitle"));
        tests.add(new Test("Test4","TestSubtitle"));
        tests.add(new Test("Test4","TestSubtitle"));
        tests.add(new Test("Test4","TestSubtitle"));
        return tests;
    }

    private List<Test> getGroup5Tests(){
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("Test5","TestSubtitle"));
        tests.add(new Test("Test5","TestSubtitle"));
        tests.add(new Test("Test5","TestSubtitle"));
        tests.add(new Test("Test5","TestSubtitle"));
        tests.add(new Test("Test5","TestSubtitle"));
        return tests;
    }
}