package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyFourthActivity extends AppCompatActivity {
   public    SwiggyFourthItems[] swiggyFourthItems;
   RecyclerView soupRv;
   public SwiggyFourthRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_fourth);
        initViews();
        createSoupData();
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        soupRv.setLayoutManager(new LinearLayoutManager(this));
        soupRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SwiggyFourthRvAdapter(swiggyFourthItems);
    }

    private void initViews() {
        soupRv = findViewById(R.id.soup_rv);
    }

    private void createSoupData() {
        swiggyFourthItems = new SwiggyFourthItems[8];

        swiggyFourthItems[0] = new SwiggyFourthItems();
        swiggyFourthItems[0].soupName = "Broccoli Parmesan Chicken soup";
        swiggyFourthItems[0].description = "A vibrant soup that will be a delight for the whole family";
        swiggyFourthItems[0].cost = "$160";

        swiggyFourthItems[1] = new SwiggyFourthItems();
        swiggyFourthItems[1].soupName = "Chicken & Vegetable soup";
        swiggyFourthItems[1].description = "This soup is ultra - comforting and packed with the healthy vegetables";
        swiggyFourthItems[1].cost = "$110";

        swiggyFourthItems[2] = new SwiggyFourthItems();
        swiggyFourthItems[2].soupName = "Cream of Chicken soup";
        swiggyFourthItems[2].description = "This is made with milk and chicken broth that's thickened with a butter and flour roux";
        swiggyFourthItems[2].cost = "$120";

        swiggyFourthItems[3] = new SwiggyFourthItems();
        swiggyFourthItems[3].soupName = "Ham & Chickpea soup";
        swiggyFourthItems[3].description = "Ham, vegetables and chickpeas, this hearty  soup is loaded with good for you flavor.";
        swiggyFourthItems[3].cost = "$160";

        swiggyFourthItems[4] = new SwiggyFourthItems();
        swiggyFourthItems[4].soupName = "Minestrone soup";
        swiggyFourthItems[4].description ="A classic, hearty tallan soup with tomatoes white beans, vegetables and pasta" ;
        swiggyFourthItems[4].cost = "$140";

        swiggyFourthItems[5] = new SwiggyFourthItems();
        swiggyFourthItems[5].soupName = "Mushroom soup";
        swiggyFourthItems[5].description ="This soup is made with cream, onions,garlic" ;
        swiggyFourthItems[5].cost = "$90";

        swiggyFourthItems[6] = new SwiggyFourthItems();
        swiggyFourthItems[6].soupName = "Broccoli Parmesan Chicken soup";
        swiggyFourthItems[6].description = "A vibrant soup that will be a delight for the whole family";
        swiggyFourthItems[6].cost = "$160";

        swiggyFourthItems[7] = new SwiggyFourthItems();
        swiggyFourthItems[7].soupName = "Broccoli Parmesan Chicken soup";
        swiggyFourthItems[7].description = "A vibrant soup that will be a delight for the whole family";
        swiggyFourthItems[7].cost = "$160";
    }
}