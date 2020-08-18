package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleService;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.navratan.wokes.Adapter.BestSellerAdapter;
import com.navratan.wokes.Adapter.CatagoryAdapter;
import com.navratan.wokes.Model.CatagoryModel;

import java.util.ArrayList;
import java.util.List;

public class AllCatagory extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_catagory);




    }
}