package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SwiggyFirstActivity extends AppCompatActivity {
    public SwiggyFirstItems[] swiggyFirstItems;
    RecyclerView swiggyRv;
    public SwiggyFirstRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_first);
        initViews();
        createSwiggyItemsData();
        setupAdapter();
        connectAdapter();
        setupAdapterClickListner();

    }

    private void setupAdapterClickListner() {
        adapter.clickListner = new OnSwiggyItemClickListner() {
            @Override
            public void onSwiggyItemClick(SwiggyFirstItems item) {
                Toast.makeText(SwiggyFirstActivity.this, item.foodName, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SwiggyFirstActivity.this,SwiggySixthActivity.class);
                startActivity(intent);
            }
        };
    }

    private void connectAdapter() {
        swiggyRv.setLayoutManager(new LinearLayoutManager(this));
        swiggyRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SwiggyFirstRvAdapter(swiggyFirstItems);
    }

    private void initViews() {
        swiggyRv = findViewById(R.id.swiggy_rv);
    }

    private void createSwiggyItemsData() {
        swiggyFirstItems = new SwiggyFirstItems[7];

        swiggyFirstItems[0] = new SwiggyFirstItems();
        swiggyFirstItems[0].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[0].foodName = "Aasife Biriyani";
        swiggyFirstItems[0].description = "Biriyani,Tandoori & Chinese";
        swiggyFirstItems[0].percentageAndType = "-40%";
        swiggyFirstItems[0].rating = "4.5";
        swiggyFirstItems[0].time = "30 mins";

        swiggyFirstItems[1] = new SwiggyFirstItems();
        swiggyFirstItems[1].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[1].foodName = "Akshaya pure Veg";
        swiggyFirstItems[1].description = "South Indian & Chinese";
        swiggyFirstItems[1].percentageAndType = "Veg";
        swiggyFirstItems[1].rating = "4.0";
        swiggyFirstItems[1].time = "30 mins";

        swiggyFirstItems[2] = new SwiggyFirstItems();
        swiggyFirstItems[2].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[2].foodName = "AI Ajwani";
        swiggyFirstItems[2].description = "Chinese,Tandoori & Indian";
        swiggyFirstItems[2].rating = "4.7";
        swiggyFirstItems[2].time = "30 mins";

        swiggyFirstItems[3] = new SwiggyFirstItems();
        swiggyFirstItems[3].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[3].foodName = "Anjappar";
        swiggyFirstItems[3].description = "Chinese,Tandoori & Indian";
        swiggyFirstItems[3].rating = "3.2";
        swiggyFirstItems[3].time = "45 mins";

        swiggyFirstItems[4] = new SwiggyFirstItems();
        swiggyFirstItems[4].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[4].foodName = "Cakes & Berrys";
        swiggyFirstItems[4].description = "Cakes,Sweetes & Snakes";
        swiggyFirstItems[4].percentageAndType = "-25%";
        swiggyFirstItems[4].rating = "4.5";
        swiggyFirstItems[4].time = "45 mins";

        swiggyFirstItems[5] = new SwiggyFirstItems();
        swiggyFirstItems[5].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[5].foodName = "Copper Kitchen";
        swiggyFirstItems[5].description = "Chettinadu,Chinese,Tandoori & ";
        swiggyFirstItems[5].percentageAndType = "-10%";
        swiggyFirstItems[5].rating = "3.3";
        swiggyFirstItems[5].time = "45 mins";

        swiggyFirstItems[6] = new SwiggyFirstItems();
        swiggyFirstItems[6].imageUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyFirstItems[6].foodName = "SS Pandian";
        swiggyFirstItems[6].description = "Chettinadu,Chinese,Tandoori & ";
        swiggyFirstItems[6].percentageAndType = "-10%";
        swiggyFirstItems[6].rating = "4.2";
        swiggyFirstItems[6].time = "30 mins";

    }
}