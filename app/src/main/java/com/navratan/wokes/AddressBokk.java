package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddressBokk extends AppCompatActivity {

    private Button add_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_bokk);

        add_address=findViewById(R.id.address_add_btn);
        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddressBokk.this,Add_Edit_Address.class));
            }
        });

    }
}