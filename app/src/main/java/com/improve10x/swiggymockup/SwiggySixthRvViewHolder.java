package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySixthRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView foodNameTxt;
    public TextView descriptionTxt;
    public TextView percentageTXt;
    public TextView ratingTxt;
    public TextView timeTxt;
    public SwiggySixthRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.food_iv);
        foodNameTxt = itemView.findViewById(R.id.foodname1_txt);
        descriptionTxt = itemView.findViewById(R.id.description1_txt);
        percentageTXt = itemView.findViewById(R.id.percentage1_txt);
        ratingTxt = itemView.findViewById(R.id.rating1_txt);
        timeTxt = itemView.findViewById(R.id.time1_txt);
    }
}
