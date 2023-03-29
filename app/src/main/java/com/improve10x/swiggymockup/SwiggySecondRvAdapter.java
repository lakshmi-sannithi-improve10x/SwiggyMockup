package com.improve10x.swiggymockup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySecondRvAdapter extends RecyclerView.Adapter<SwiggySecondRvViewHolder> {
    public SwiggySecondItems[] items;
    SwiggySecondItemActionListener actionListener;
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
     if (item.itemCount == 0){
         holder.minusBtn.setVisibility(View.GONE);
         holder.itemCountTxt.setVisibility(View.GONE);
     }else {
         holder.itemCountTxt.setText(item.itemCount + "");
         holder.minusBtn.setVisibility(View.VISIBLE);
         holder.itemCountTxt.setVisibility(View.VISIBLE);
     }
         holder.addBtn.setOnClickListener(view -> {
            actionListener.onAddClicked(item);
         });

         holder.minusBtn.setOnClickListener(view -> {
             actionListener.onRemoveClicked(item);
         });
     }


    @Override
    public int getItemCount() {
        return items.length;
    }
}
