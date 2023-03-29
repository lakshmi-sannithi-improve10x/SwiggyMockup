package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySeventhRvAdapter extends RecyclerView.Adapter<SwiggySeventhRvViewHolder> {
    public SwiggySeventhItems[] items;
    public SwiggySeventhRvAdapter(SwiggySeventhItems[] swiggySeventhItems){
        items = swiggySeventhItems;
    }

    @NonNull
    @Override
    public SwiggySeventhRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy7_items,parent,false);
        SwiggySeventhRvViewHolder viewHolder = new SwiggySeventhRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggySeventhRvViewHolder holder, int position) {
        SwiggySeventhItems items1 = items[position];
        holder.foodNameTxt.setText(items1.foodName);
        holder.descriptionTxt.setText(items1.description);
        holder.timeTxt.setText(items1.time);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
