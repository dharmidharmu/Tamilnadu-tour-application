package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;

class PhrasesAdapter extends ArrayAdapter<List> {

    PhrasesAdapter(@NonNull Activity context, ArrayList<List> phrases) {
        super(context, 0, phrases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phrases, parent, false);
        }

        List placeItem = getItem(position);

        TextView placeName = ButterKnife.findById(listItemView, R.id.french);
        TextView placeDescription = ButterKnife.findById(listItemView, R.id.english);

        assert placeItem != null;
        placeName.setText(placeItem.getInfo());
        placeDescription.setText(placeItem.getInfo2());

        return listItemView;
    }
}
