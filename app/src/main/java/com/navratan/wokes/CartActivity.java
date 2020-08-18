package com.navratan.wokes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.navratan.wokes.Adapter.CartAdapter;
import com.navratan.wokes.Model.CartModel;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity  {

    RecyclerView cartrecycler;
    CartAdapter cartAdapter;
    Button payment;
TextView change_aad;
    List<CartModel> cartModels = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        change_aad=findViewById(R.id.change_address_cart);
        change_aad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartActivity.this,AddressBokk.class));
            }
        });
        cartrecycler = findViewById(R.id.cart_products);
        cartAdapter = new CartAdapter(cartModels);
        payment = findViewById(R.id.pay_btn);
        CartModel cartModel = new CartModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/nikeshoes.png?alt=media&token=daf94588-01e3-47b8-9af1-f00981f2e635", "Nike Shoes", "150.00", "1");
        CartModel cartModel1 = new CartModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/chess.png?alt=media&token=be75489c-0bdb-4646-ab5e-9ae27ff56900", "Chess Board", "153.00", "2");
        CartModel cartModel4 = new CartModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/nike%20cap.jpg?alt=media&token=f59ed901-92df-4d3b-82c9-42a745647893", "Nivea Soft Gel", "15.00", "0");


        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPaymentOption();
            }
        });
        cartModels.add(cartModel);
        cartModels.add(cartModel1);
        cartModels.add(cartModel4);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartrecycler.setLayoutManager(layoutManager);
        cartrecycler.setAdapter(cartAdapter);
        cartrecycler.setHasFixedSize(true);
        cartAdapter.notifyDataSetChanged();


    }

    private void ShowPaymentOption() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose Payment Option");
        final View customLayout = getLayoutInflater().inflate(R.layout.payment_layout, null);
        builder.setView(customLayout);

        AlertDialog dialog = builder.create();
        dialog.show();
    }



}