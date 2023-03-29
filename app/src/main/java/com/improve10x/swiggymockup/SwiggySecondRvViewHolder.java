package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySecondRvViewHolder extends RecyclerView.ViewHolder {
    public TextView foodNameTxt;
    public TextView descriptionTxt;
    public TextView costTxt;
    public TextView itemCountTxt;
    public ImageButton minusBtn;
    public ImageButton addBtn;

    public SwiggySecondRvViewHolder(@NonNull View itemView) {
        super(itemView);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
        itemCountTxt = itemView.findViewById(R.id.itemcount_txt);
        minusBtn = itemView.findViewById(R.id.minus_btn);
        addBtn = itemView.findViewById(R.id.add_btn);
    }
}
