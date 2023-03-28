package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggySixthRvAdapter extends RecyclerView.Adapter<SwiggySixthRvViewHolder> {
    public SwiggySixthItems[] items;
    OnSwiggySixthItemClickListener clickListener;
    public SwiggySixthRvAdapter(SwiggySixthItems[] swiggySixthItems){
        items = swiggySixthItems;
    }
    @NonNull
    @Override
    public SwiggySixthRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy6_items,parent,false);
        SwiggySixthRvViewHolder viewHolder = new SwiggySixthRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggySixthRvViewHolder holder, int position) {
      SwiggySixthItems item = items[position];
      holder.foodNameTxt.setText(item.foodName);
      holder.descriptionTxt.setText(item.description);
      holder.percentageTXt.setText(item.percentageAndType);
      holder.ratingTxt.setText(item.rating);
      holder.timeTxt.setText(item.time);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);
        holder.itemView.setOnClickListener(view -> {
          clickListener.onSwiggyItemClick(item);
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
