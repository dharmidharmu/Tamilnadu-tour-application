package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ExpensiveFragment extends Fragment {

    final ViewGroup nullParent = null;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    View view;

    public ExpensiveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.recycle, nullParent);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        final ArrayList<List> costly = new ArrayList<>();
        costly.add(new List(R.drawable.costlycaf1, R.string.expensive_cafe_1, R.string.expensive_cafe_desc_1));
        costly.add(new List(R.drawable.costlycaf2, R.string.expensive_cafe_2, R.string.expensive_cafe_desc_2));
        costly.add(new List(R.drawable.costlycaf3, R.string.expensive_cafe_3, R.string.expensive_cafe_desc_3));
        costly.add(new List(R.drawable.costlycaf4, R.string.expensive_cafe_4, R.string.expensive_cafe_desc_4));
        costly.add(new List(R.drawable.costlycaf5, R.string.expensive_cafe_5, R.string.expensive_cafe_desc_5));
        costly.add(new List(R.drawable.costlycaf6, R.string.expensive_cafe_6, R.string.expensive_cafe_desc_6));
        costly.add(new List(R.drawable.costlycaf7, R.string.expensive_cafe_7, R.string.expensive_cafe_desc_7));
        costly.add(new List(R.drawable.costlycaf8, R.string.expensive_cafe_8, R.string.expensive_cafe_desc_8));
        costly.add(new List(R.drawable.costlycaf9, R.string.expensive_cafe_9, R.string.expensive_cafe_desc_9));
        costly.add(new List(R.drawable.costlycaf10, R.string.expensive_cafe_10, R.string.expensive_cafe_desc_10));

        adapter = new CardAdapter(costly);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
