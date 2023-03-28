package com.improve10x.swiggymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class SwiggySixthActivity extends AppCompatActivity {
    public SwiggySixthItems[] swiggySixthItems;
    RecyclerView swiggyItemsRv;
    public SwiggySixthRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_sixth);
        initViews();
        createFoodItemsData();
        setupAdapter();
        connectAdapter();
        setupAdapterClickListener();
    }

    private void setupAdapterClickListener() {
        adapter.clickListener = new OnSwiggySixthItemClickListener() {
            @Override
            public void onSwiggyItemClick(SwiggySixthItems item) {
                Toast.makeText(SwiggySixthActivity.this, item.imageUrl, Toast.LENGTH_SHORT).show();
            }
        };
    }

    private void connectAdapter() {
        swiggyItemsRv.setLayoutManager(new GridLayoutManager(this,3));
        swiggyItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SwiggySixthRvAdapter(swiggySixthItems);
    }

    private void initViews() {
        swiggyItemsRv = findViewById(R.id.swiggyitems_rv);
    }

    private void createFoodItemsData() {
        swiggySixthItems = new SwiggySixthItems[9];

        swiggySixthItems[0] = new SwiggySixthItems();
        swiggySixthItems[0].imageUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggySixthItems[0].foodName = "Aasife Biriyani";
        swiggySixthItems[0].description = "Biriyani,Tandoori & Chinese";
        swiggySixthItems[0].percentageAndType = "-40%";
        swiggySixthItems[0].rating = "4.5";
        swiggySixthItems[0].time = "30mins";

        swiggySixthItems[1] = new SwiggySixthItems();
        swiggySixthItems[1].imageUrl = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        swiggySixthItems[1].foodName = "Akshaya pure Veg";
        swiggySixthItems[1].description = "South Indian & Chinese";
        swiggySixthItems[1].percentageAndType = "Veg";
        swiggySixthItems[1].rating = "4.0";
        swiggySixthItems[1].time = "30mins";

        swiggySixthItems[2] = new SwiggySixthItems();
        swiggySixthItems[2].imageUrl = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        swiggySixthItems[2].foodName = "AI Ajwani";
        swiggySixthItems[2].description = "Chinese,Tandoori & Indian";
        swiggySixthItems[2].rating = "4.7";
        swiggySixthItems[2].time = "30mins";

        swiggySixthItems[3] = new SwiggySixthItems();
        swiggySixthItems[3].imageUrl ="https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg" ;
        swiggySixthItems[3].foodName = "Anjappar";
        swiggySixthItems[3].description = "Tandoori,Indian";
        swiggySixthItems[3].rating = "3.2";
        swiggySixthItems[3].time = "45mins";
//"https://i.pinimg.com/236x/45/64/ab/4564abb1f916c9da2a3a732b4aa9f998.jpg?nii=t"
        swiggySixthItems[4] = new SwiggySixthItems();
        swiggySixthItems[4].imageUrl = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
        swiggySixthItems[4].foodName = "Cakes";
        swiggySixthItems[4].description = "sweets,snakes";
        swiggySixthItems[4].percentageAndType ="-25%";
        swiggySixthItems[4].rating = "4.0";
        swiggySixthItems[4].rating = "30mins";

        swiggySixthItems[5] = new SwiggySixthItems();
        swiggySixthItems[5].imageUrl = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
        swiggySixthItems[5].foodName = "Copper Kitchen";
        swiggySixthItems[5].description = "Chettinadu,Chinese,Tandoori & ";
        swiggySixthItems[5].percentageAndType = "-10%";
        swiggySixthItems[5].rating = "3.3";
        swiggySixthItems[5].time = "45mins";

        swiggySixthItems[6] = new SwiggySixthItems();
        swiggySixthItems[6].imageUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggySixthItems[6].foodName = "SS Pandian";
        swiggySixthItems[6].description = "Chettinadu,Chinese,Tandoori ";
        swiggySixthItems[6].percentageAndType = "-10%";
        swiggySixthItems[6].rating = "4.2";
        swiggySixthItems[6].time = "30mins";

        swiggySixthItems[7] = new SwiggySixthItems();
        swiggySixthItems[7].imageUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggySixthItems[7].foodName = "Aasife Biriyani";
        swiggySixthItems[7].description = "Biriyani,Tandoori & Chinese";
        swiggySixthItems[7].percentageAndType = "-40%";
        swiggySixthItems[7].rating = "4.5";
        swiggySixthItems[7].time = "30mins";

        swiggySixthItems[8] = new SwiggySixthItems();
        swiggySixthItems[8].imageUrl = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        swiggySixthItems[8].foodName = "Akshaya pure Veg";
        swiggySixthItems[8].description = "South Indian & Chinese";
        swiggySixthItems[8].percentageAndType = "Veg";
        swiggySixthItems[8].rating = "4.0";
        swiggySixthItems[8].time = "30mins";



    }
}

// swiggySixthItems[0] = new SwiggySixthItems();
//        swiggySixthItems[0].imageUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
//        swiggySixthItems[0].foodName = "Aasife Biriyani";
//        swiggySixthItems[0].description = "Biriyani,Tandoori & Chinese";
//        swiggySixthItems[0].percentageAndType = "-40%";
//        swiggySixthItems[0].rating = "4.5";
//        swiggySixthItems[0].time = "30mins";
//swiggySixthItems[7] = new SwiggySixthItems();
//        swiggySixthItems[7].imageUrl = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
//        swiggySixthItems[7].foodName = "Akshaya Veg";
//        swiggySixthItems[7].description = "South Indian";
//        swiggySixthItems[7].percentageAndType = "Veg";
//        swiggySixthItems[7].rating = "4.0";
//        swiggySixthItems[7].time = "30mins";