package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.navratan.wokes.Adapter.OrdersAdapter;
import com.navratan.wokes.Model.OrdersModel;

import java.util.ArrayList;
import java.util.List;

public class Orders extends AppCompatActivity {

    private RecyclerView orders_recycler;
    private OrdersAdapter ordersAdapter;
    List<OrdersModel> ordersModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        orders_recycler = findViewById(R.id.order_recycler_view);
        ShowOrders();


    }

    private void ShowOrders() {

        OrdersModel ordersModel = new OrdersModel("Delivered","Sun,5Aug at 10:29 AM","#54999","COD","1");
        OrdersModel ordersMode2 = new OrdersModel("Pending","Sun,13Aug at 12:27 AM","#5467","UPI","10");
        OrdersModel ordersMode3 = new OrdersModel("Cancel","Mon,09Aug at 04:37 PM","#542345","GOOGLE PAY","5");
        OrdersModel ordersMode4 = new OrdersModel("Cancelled","Tue,06Aug at 0:46 PM","#54Y78","COD","7");

        ordersModels.add(ordersModel);
        ordersModels.add(ordersMode2);
        ordersModels.add(ordersMode3);
        ordersModels.add(ordersMode4);


        ordersAdapter = new OrdersAdapter(ordersModels);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        orders_recycler.setLayoutManager(layoutManager);
        orders_recycler.setAdapter(ordersAdapter);
        orders_recycler.setHasFixedSize(true);


    }
}