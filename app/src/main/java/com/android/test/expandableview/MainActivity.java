package com.android.test.expandableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.aakira.expandablelayout.Utils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //recyclerView.addItemDecoration(new DividerItemDecoration(this,2));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ItemModel> data = new ArrayList<>();
        data.add(new ItemModel(
                "0 ACCELERATE_DECELERATE_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.ACCELERATE_DECELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "1 ACCELERATE_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.ACCELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "2 BOUNCE_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.BOUNCE_INTERPOLATOR)));
        data.add(new ItemModel(
                "4 FAST_OUT_LINEAR_IN_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.FAST_OUT_LINEAR_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "5 FAST_OUT_SLOW_IN_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "6 LINEAR_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.LINEAR_INTERPOLATOR)));
        data.add(new ItemModel(
                "7 LINEAR_OUT_SLOW_IN_INTERPOLATOR",
                "This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view.This is the description and should be visible in the extended view",
                R.color.white,
                R.color.white,
                Utils.createInterpolator(Utils.LINEAR_OUT_SLOW_IN_INTERPOLATOR)));
        recyclerView.setAdapter(new RecycleViewAdapter(data));
    }
}
