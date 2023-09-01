package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyFourthActivity extends AppCompatActivity {
   RecyclerView soupRv;
   public SwiggySecondItems[] swiggySecondItems;
   public SwiggySecondRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_fourth);
        initViews();
        createSoupData();
        setupAdapter();
        connectAdapter();
        setupActionListener();

    }

    private void setupActionListener() {
        adapter.actionListener = new SwiggySecondItemActionListener() {
            @Override
            public void onAddClicked(SwiggySecondItems item) {
                item.itemCount ++;
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onRemoveClicked(SwiggySecondItems item) {
                  item.itemCount --;
                  adapter.notifyDataSetChanged();
            }
        };
    }

    private void connectAdapter() {
        soupRv.setLayoutManager(new LinearLayoutManager(this));
        soupRv.setAdapter(adapter);

    }

    private void setupAdapter() {
        adapter = new SwiggySecondRvAdapter(swiggySecondItems);

    }

    private void initViews() {
        soupRv = findViewById(R.id.soup_rv);
    }

    private void createSoupData() {
        swiggySecondItems = new SwiggySecondItems[5];

        swiggySecondItems[0] = new SwiggySecondItems();
        swiggySecondItems[0].foodName = "Shawarma Roll";
        swiggySecondItems[0].description = "Meat  cut into thin slices and stuffed in Kuboos";
        swiggySecondItems[0].cost = "$80";
        swiggySecondItems[0].itemCount = 0;

        swiggySecondItems[1] = new SwiggySecondItems();
        swiggySecondItems[1].foodName = "Shawarma Plate";
        swiggySecondItems[1].description = "Meat  cut into thin slices and served with Kuboos";
        swiggySecondItems[1].cost = "$130";
        swiggySecondItems[1].itemCount = 0;

        swiggySecondItems[2] = new SwiggySecondItems();
        swiggySecondItems[2].foodName = " Special Shawarma Roll";
        swiggySecondItems[2].description = "Meat  cut into thin slices and styffed with special sauce";
        swiggySecondItems[2].cost = "$100";
        swiggySecondItems[2].itemCount = 0;

        swiggySecondItems[3] = new SwiggySecondItems();
        swiggySecondItems[3].foodName = " Special Shawarma Plate";
        swiggySecondItems[3].description = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        swiggySecondItems[3].cost = "$140";
        swiggySecondItems[3].itemCount = 0;

        swiggySecondItems[4] = new SwiggySecondItems();
        swiggySecondItems[4].foodName = "Shawarma Roll";
        swiggySecondItems[4].description = "Meat  cut into thin slices and stuffed in Kuboos";
        swiggySecondItems[4].cost = "$120";
        swiggySecondItems[4].itemCount = 0;


    }
}