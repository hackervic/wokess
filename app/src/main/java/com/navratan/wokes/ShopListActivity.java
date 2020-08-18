package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.navratan.wokes.Adapter.ShopsAdapter;
import com.navratan.wokes.Model.ShopsModel;

import java.util.ArrayList;
import java.util.List;

public class ShopListActivity extends AppCompatActivity {

    private RecyclerView shopView;
    private ShopsAdapter shopsAdapter;
    private ShopsModel shopsModel;
    List<ShopsModel> shopsModelList = new ArrayList<>();
    private ImageView arrow;
    private TextView scount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        shopView = findViewById(R.id.shop_list_recycler);
        arrow=findViewById(R.id.back_arrow);
        scount=findViewById(R.id.ShopCount);

                ShowShops();
                arrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(ShopListActivity.this,HomeActivity.class));
                    }
                });

    }

    private void ShowShops() {
        shopsAdapter = new ShopsAdapter(shopsModelList);
        ShopsModel shopsModel1 = new ShopsModel("Oven Classic", "Tagore Railway Colony ,South Civil Line", "Open", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/ovenc.jpg?alt=media&token=aa3ef56c-2181-4657-9579-436775cd0237");
        ShopsModel shopsModel2 = new ShopsModel("New Khandelwal", "Wright Town , Jabalpur", "Close", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/khandelbal.jpg?alt=media&token=64601981-aced-44d8-9c4d-10629037e0a8");
        ShopsModel shopsModel3 = new ShopsModel("Raamesh Medical Store", "Napier Town", "Open", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/rms.jpg?alt=media&token=a43318a7-5bdc-4e68-aeac-46601e3514b8");
        ShopsModel shopsModel5 = new ShopsModel("Vegetables King's", "Gorakhpur , Jabalpur", "Open", "");
        ShopsModel shopsModel4 = new ShopsModel("Anand Bhandar", "Wright Town, Jabalpur", "Open", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/anandbjpg.jpg?alt=media&token=e1e87c42-b8e6-4573-8df3-561e9921f7ec");
        ShopsModel shopsModel6 = new ShopsModel("D Buddy Pet Shop", "Jabalpur , Madhya Pradesh", "Open", "" );
        ShopsModel shopsModel7 = new ShopsModel("Skechers", "Jabalpur, Jabalpur", "Close",  "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/sketch.jpg?alt=media&token=a39a52dd-470f-4f8b-a8c8-7c7051d59934");
        ShopsModel shopsModel8 = new ShopsModel("Aman Book", "Malviya Chowk , Jabalpur", "Close",  "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/bookdepot.jpg?alt=media&token=f6a15748-0c94-443c-ae5a-2bac12131df8");
        ShopsModel shopsModel9 = new ShopsModel("Sahu Electronics", "Labour Chowk Ydav Colony , Jabalpur", "Close",  "");
        ShopsModel shopsModel10 = new ShopsModel("Khandelwal Supermart", "Madan Mahal , Jabalpur", "Open",  "");
        ShopsModel shopsModel11 = new ShopsModel("HariOm Electronics", "Tularam Chowk Ganjipura , Jabalpur", "Open",  "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/hari.jpg?alt=media&token=6630878e-0c96-4396-aeb5-be0057f024ed");

        shopsModelList.add(shopsModel1);
        shopsModelList.add(shopsModel2);
        shopsModelList.add(shopsModel3);
        shopsModelList.add(shopsModel4);
        shopsModelList.add(shopsModel5);
        shopsModelList.add(shopsModel6);
        shopsModelList.add(shopsModel7);
        shopsModelList.add(shopsModel8);
        shopsModelList.add(shopsModel9);
        shopsModelList.add(shopsModel10);
        shopsModelList.add(shopsModel11);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        shopView.setLayoutManager(layoutManager);
        shopView.setAdapter(shopsAdapter);
        shopView.setHasFixedSize(true);
        int s = shopsModelList.size();
        scount.setText(s +" "+"Shops to choose from");

    }
}