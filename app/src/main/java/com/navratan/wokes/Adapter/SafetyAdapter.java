package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.SafetyModel;
import com.navratan.wokes.R;

import java.util.List;

public class SafetyAdapter extends RecyclerView.Adapter<SafetyAdapter.SafetyViewHolder> {

    List<SafetyModel> safetyModels;

    public SafetyAdapter(List<SafetyModel> safetyModels) {
        this.safetyModels = safetyModels;
    }

    @NonNull
    @Override
    public SafetyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seafty_layout,parent,false);
        return new SafetyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SafetyViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        SafetyModel safetyModel = safetyModels.get(position);
        Glide.with(context).load(safetyModel.getSafetyimageurl()).placeholder(R.drawable.hb).into(holder.safetyimage);
    }

    @Override
    public int getItemCount() {
        return safetyModels.size();
    }

    public class SafetyViewHolder extends RecyclerView.ViewHolder {
        ImageView safetyimage;
        public SafetyViewHolder(@NonNull View itemView) {
            super(itemView);
            safetyimage=itemView.findViewById(R.id.safety_image);
        }
    }
}
