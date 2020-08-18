package com.navratan.wokes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.BannerModel;
import com.navratan.wokes.Model.CatagoryModel;
import com.navratan.wokes.R;
import com.navratan.wokes.ShopListActivity;

import java.util.List;

public class CatagoryAdapter extends RecyclerView.Adapter<CatagoryAdapter.CatViewHolder> {

    List<CatagoryModel>  catagoryModels;
    Context context;


    public CatagoryAdapter(List<CatagoryModel> catagoryModels) {
        this.catagoryModels = catagoryModels;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catagories_layout,parent,false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
          context = holder.itemView.getContext();
        CatagoryModel catagoryModel = catagoryModels.get(position);
        holder.catname.setText(catagoryModel.getCatagoryname());
        Glide.with(context).
                load(catagoryModel.getCatagoryimage())
                .into(holder.catimage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ShopListActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return catagoryModels.size();
    }

    public static class CatViewHolder extends RecyclerView.ViewHolder {
        ImageView catimage;
           TextView catname;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            catimage = itemView.findViewById(R.id.catagory_image);
            catname=itemView.findViewById(R.id.catagory_name);
        }
    }


}
