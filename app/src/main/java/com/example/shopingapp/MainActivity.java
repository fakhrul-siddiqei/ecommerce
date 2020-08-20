package com.example.shopingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.LayoutManager layoutManager;
    private Adapter homeAdapter;
    private ViewPager viewPager;
    //arrays of images and title
    TextView tap,data,value;
    RecyclerView dataList,datalist1,datalist2;
    List<String> titles=new ArrayList<>();
    List<Integer> images=new ArrayList<>();
    List<String> prices=new ArrayList<>();
    Adapterhome adapter;
    Adapterhome2 adapterhome2;
    LinearLayout ct;
    int k=0;
    public String[] options={"REFERRAL INCOME","GENERATION BONUS","DAILY WORK BONUS>"};
    public String[] am={"50500৳","20125৳","940৳"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList = findViewById(R.id.recycle);
        datalist1 = findViewById(R.id.rec);
        datalist2=findViewById(R.id.rec1);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
        titles.add("Light LED");
        titles.add("Radio");
        titles.add("Sound Recorder");
        titles.add("Xiaomi m30");
        titles.add("k93 hair clipper");
        titles.add("Digital Frame");
        titles.add("Ceiling Fan");
        titles.add("Battery");

        prices.add("500 taka");
        prices.add("500 taka");
        prices.add("700 taka");
        prices.add("1220 taka");
        prices.add("400 taka");
        prices.add("200 taka");
        prices.add("5500 taka");
        prices.add("120 taka");
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);

        adapter = new Adapterhome(this,titles,images,prices);
        adapterhome2=new Adapterhome2(this,titles,images);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager23
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapterhome2);
        datalist1.setLayoutManager(layoutManager2);
        datalist1.setAdapter(adapter);
        datalist2.setLayoutManager(layoutManager23);
        datalist2.setAdapter(adapter);

    }


}
