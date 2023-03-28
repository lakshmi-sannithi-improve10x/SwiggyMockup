package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyFourthRvAdapter extends RecyclerView.Adapter<SwiggyFourthRvViewHolder> {
    public SwiggyFourthItems[] items;
    public SwiggyFourthRvAdapter(SwiggyFourthItems[] swiggyFourthItems){
        items = swiggyFourthItems;
    }

    @NonNull
    @Override
    public SwiggyFourthRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy4_items,parent,false);
        SwiggyFourthRvViewHolder viewHolder = new SwiggyFourthRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyFourthRvViewHolder holder, int position) {
        SwiggyFourthItems item = items[position];
        holder.soupNameTxt.setText(item.soupName);
        holder.descriptionTxt.setText(item.description);
        holder.costTxt.setText(item.cost);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
