package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySeventhRvViewHolder extends RecyclerView.ViewHolder {
    public TextView foodNameTxt;
    public TextView descriptionTxt;
    public TextView timeTxt;
    public SwiggySeventhRvViewHolder(@NonNull View itemView) {
        super(itemView);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);

    }
}
