package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggySeventhActivity extends AppCompatActivity {
    public SwiggySeventhItems[]  swiggySeventhItems;
    RecyclerView currentOrdersRv;
    public  SwiggySeventhRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_seventh);
        initViews();
        createSwiggySeventhItemsData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        currentOrdersRv.setLayoutManager(new LinearLayoutManager(this));
        currentOrdersRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SwiggySeventhRvAdapter(swiggySeventhItems);
    }

    private void initViews() {
        currentOrdersRv = findViewById(R.id.currentorders_rv);
    }

    private void createSwiggySeventhItemsData() {
        swiggySeventhItems = new SwiggySeventhItems[3];

        swiggySeventhItems[0] = new SwiggySeventhItems();
        swiggySeventhItems[0].foodName = "AI Ajwani";
        swiggySeventhItems[0].description = "Shawarma Roll x1,Shawarma plate x1";
        swiggySeventhItems[0].time = "25mins";

        swiggySeventhItems[1] = new SwiggySeventhItems();
        swiggySeventhItems[1].foodName = "Copper Kitchen";
        swiggySeventhItems[1].description = "Tandoori Chicken x2";
        swiggySeventhItems[1].time = "37mins";

        swiggySeventhItems[2] = new SwiggySeventhItems();
        swiggySeventhItems[2].foodName = "Sandwich Shop";
        swiggySeventhItems[2].description = "Chicken sandwich x2,Panner Roll x1";
        swiggySeventhItems[2].time = "25mins";


    }
}