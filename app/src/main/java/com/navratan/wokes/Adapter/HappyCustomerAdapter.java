package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.HappyCustomerModel;
import com.navratan.wokes.R;

import java.util.List;

public class HappyCustomerAdapter extends RecyclerView.Adapter<HappyCustomerAdapter.HCViewHolder> {

    List<HappyCustomerModel> happyCustomerModels;

    public HappyCustomerAdapter(List<HappyCustomerModel> happyCustomerModels) {
        this.happyCustomerModels = happyCustomerModels;
    }

    @NonNull
    @Override
    public HCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.happy_customer_layout, parent, false);
        return new HappyCustomerAdapter.HCViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HCViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        HappyCustomerModel happyCustomerModel = happyCustomerModels.get(position);
        holder.hname.setText(happyCustomerModel.getHcname());
        holder.hloc.setText(happyCustomerModel.getHclocation());
        holder.hcom.setText(happyCustomerModel.getHccomment());
        Glide.with(context).load(happyCustomerModel.getHcimage()).into(holder.himg);

    }

    @Override
    public int getItemCount() {
        return happyCustomerModels.size();
    }

    public class HCViewHolder extends RecyclerView.ViewHolder {
        TextView hname, hloc, hcom;
        ImageView himg;
        public HCViewHolder(@NonNull View itemView) {
            super(itemView);
            hname = itemView.findViewById(R.id.hc_name);
            hloc = itemView.findViewById(R.id.hc_location);
            hcom = itemView.findViewById(R.id.hc_comment);
            himg = itemView.findViewById(R.id.hc_image);

        }
    }
}
