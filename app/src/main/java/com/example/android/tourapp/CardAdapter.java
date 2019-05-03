package com.example.android.tourapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private ArrayList<List> list;

    CardAdapter(ArrayList<List> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        final List card = list.get(position);
        viewHolder.mName.setText(card.getInfo2());
        viewHolder.mDescription.setText(card.getInfo3());
        viewHolder.mPicture.setImageResource(card.getInfo());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView mName;
        TextView mDescription;
        ImageView mPicture;
        CardView mCard;

        ViewHolder(final View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.name);
            mDescription = (TextView) itemView.findViewById(R.id.description);
            mPicture = (ImageView) itemView.findViewById(R.id.place);
            mCard = (CardView) itemView.findViewById(R.id.cv);
        }
    }
}

