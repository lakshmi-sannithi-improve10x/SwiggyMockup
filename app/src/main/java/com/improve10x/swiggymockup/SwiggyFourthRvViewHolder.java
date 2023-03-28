package com.improve10x.swiggymockup;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyFourthRvViewHolder extends RecyclerView.ViewHolder {
    public TextView soupNameTxt;
    public TextView descriptionTxt;
    public TextView costTxt;
    public SwiggyFourthRvViewHolder(@NonNull View itemView) {
        super(itemView);
        soupNameTxt = itemView.findViewById(R.id.soupname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
    }
}
