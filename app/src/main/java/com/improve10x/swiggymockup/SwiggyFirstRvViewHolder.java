package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyFirstRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView foodNameTxt;
    public TextView descriptionTxt;
    public TextView percentageTXt;
    public TextView ratingTxt;
    public TextView timeTxt;
    public SwiggyFirstRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        percentageTXt = itemView.findViewById(R.id.percentage_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
    }
}
