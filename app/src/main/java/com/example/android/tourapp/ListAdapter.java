package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;

class ListAdapter extends ArrayAdapter<List> {

    ListAdapter(@NonNull Activity context, ArrayList<List> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {

        // Check if the current view is reused else inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        // Get the object located at position
        List placeItem = getItem(position);
        TextView placeName = ButterKnife.findById(listItemView, R.id.place_name);
        TextView placeDescription = ButterKnife.findById(listItemView, R.id.place_descrip);
        ImageView placeImage = ButterKnife.findById(listItemView, R.id.pic);

        assert placeItem != null;
        placeName.setText(placeItem.getInfo2());
        placeDescription.setText(placeItem.getInfo3());
        placeImage.setImageResource(placeItem.getInfo());

        return listItemView;
    }
}
