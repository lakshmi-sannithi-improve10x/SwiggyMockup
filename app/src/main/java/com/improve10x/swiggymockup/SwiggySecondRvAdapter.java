package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySecondRvAdapter extends RecyclerView.Adapter<SwiggySecondRvViewHolder> {
    public SwiggySecondItems[] items;
    public SwiggySecondRvAdapter(SwiggySecondItems[] swiggySecondItems){
        items = swiggySecondItems;
    }
    @NonNull
    @Override
    public SwiggySecondRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy2_items,parent,false);
        SwiggySecondRvViewHolder viewHolder = new SwiggySecondRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggySecondRvViewHolder holder, int position) {
     SwiggySecondItems item = items[position];
     holder.foodNameTxt.setText(item.foodName);
     holder.descriptionTxt.setText(item.description);
     holder.costTxt.setText(item.cost);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
