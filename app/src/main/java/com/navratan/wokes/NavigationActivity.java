package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.tech.NfcV;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class NavigationActivity extends AppCompatActivity {

    private TextView usrname , usrcontact;
    private TextView Orders , Chats , Prescription, Address , Faq , About , Franchise , ChangePassword,shop_by;
    private ImageButton edit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

    usrname=findViewById(R.id.user_nam);
    usrcontact=findViewById(R.id.user_contact_No);
    Orders = findViewById(R.id.orders_activity);
    Chats=findViewById(R.id.chats);
    Prescription=findViewById(R.id.my_prescreption);
    Address=findViewById(R.id.address_book);
    Faq=findViewById(R.id.faq);
    About=findViewById(R.id.about_us);
    Franchise=findViewById(R.id.franchise);
    ChangePassword=findViewById(R.id.change_password);
    shop_by=findViewById(R.id.shop_by_cat);
    edit_btn=findViewById(R.id.edit_btn);
    edit_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(NavigationActivity.this,User_Profile.class));

        }
    });

    shop_by.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(NavigationActivity.this,AllCatagory.class));

        }
    });

    Orders.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(NavigationActivity.this,Orders.class));

        }
    });
        Chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,ThankYouActivity.class));

            }
        });
        ChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,ChangePassweord.class));

            }
        });
        Faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,FAQ.class));

            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,AboutUs.class));

            }
        });
        Franchise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,Franchise.class));

            }
        });

        Prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,Prescription.class));
            }
        });

        Chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,ThankYouActivity.class));

            }
        });

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,AddressBokk.class));

            }
        });


    }
}