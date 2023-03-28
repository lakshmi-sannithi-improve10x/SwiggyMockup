package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySecondRvViewHolder extends RecyclerView.ViewHolder {
    public TextView foodNameTxt;
    public TextView descriptionTxt;
    public TextView costTxt;

    public SwiggySecondRvViewHolder(@NonNull View itemView) {
        super(itemView);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
    }
}
