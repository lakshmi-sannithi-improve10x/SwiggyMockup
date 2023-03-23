package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggyFirstRvAdapter extends RecyclerView.Adapter<SwiggyFirstRvViewHolder> {
    public SwiggyFirstItems[] items;
    public SwiggyFirstRvAdapter(SwiggyFirstItems[] swiggyFirstItems){
        items = swiggyFirstItems;
    }
    @NonNull
    @Override
    public SwiggyFirstRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy1_items,parent,false);
        SwiggyFirstRvViewHolder viewHolder = new SwiggyFirstRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyFirstRvViewHolder holder, int position) {
        SwiggyFirstItems item = items[position];
        holder.foodNameTxt.setText(item.foodName);
        holder.descriptionTxt.setText(item.description);
        holder.percentageTXt.setText(item.percentageAndType);
        holder.ratingTxt.setText(item.rating);
        holder.timeTxt.setText(item.time);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
