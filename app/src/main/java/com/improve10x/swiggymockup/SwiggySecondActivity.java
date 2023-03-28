package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggySecondActivity extends AppCompatActivity {
      public SwiggySecondItems[]  swiggySecondItems;
      RecyclerView foodRv;
      public SwiggySecondRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_second);
        initviews();
        createShawarmaItemData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        foodRv.setLayoutManager(new LinearLayoutManager(this));
        foodRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SwiggySecondRvAdapter(swiggySecondItems);
    }

    private void initviews() {
        foodRv = findViewById(R.id.food_rv);
    }

    private void createShawarmaItemData() {
        swiggySecondItems = new SwiggySecondItems[5];

        swiggySecondItems[0] = new SwiggySecondItems();
        swiggySecondItems[0].foodName = "Shawarma Roll";
        swiggySecondItems[0].description = "Meat  cut into thin slices and stuffed in Kuboos";
        swiggySecondItems[0].cost = "$80";

        swiggySecondItems[1] = new SwiggySecondItems();
        swiggySecondItems[1].foodName = "Shawarma Plate";
        swiggySecondItems[1].description = "Meat  cut into thin slices and served with Kuboos";
        swiggySecondItems[1].cost = "$130";

        swiggySecondItems[2] = new SwiggySecondItems();
        swiggySecondItems[2].foodName = " Special Shawarma Roll";
        swiggySecondItems[2].description = "Meat  cut into thin slices and styffed with special sauce";
        swiggySecondItems[2].cost = "$100";

        swiggySecondItems[3] = new SwiggySecondItems();
        swiggySecondItems[3].foodName = " Special Shawarma Plate";
        swiggySecondItems[3].description = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        swiggySecondItems[3].cost = "$140";

        swiggySecondItems[4] = new SwiggySecondItems();
        swiggySecondItems[4].foodName = "Shawarma Roll";
        swiggySecondItems[4].description = "Meat  cut into thin slices and stuffed in Kuboos";
        swiggySecondItems[4].cost = "$120";


    }
}