package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.navratan.wokes.Model.BannerModel;
import com.navratan.wokes.R;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {

    private List<BannerModel> bannerModels;
    
    public BannerAdapter(List<BannerModel> bannerModels)
    {
        this.bannerModels = bannerModels;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          Context context = holder.itemView.getContext();
        BannerModel bannerModel = bannerModels.get(position);
        holder.bannerimgview.setAnimation(AnimationUtils.loadAnimation(context,R.anim.down_to_up));
        Glide.with(context).
                load(bannerModel.getBannerimage())
                .into(holder.bannerimgview);

    }

    @Override
    public int getItemCount() {
        return bannerModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView bannerimgview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bannerimgview=itemView.findViewById(R.id.bannerimg);
        }
    }
}
