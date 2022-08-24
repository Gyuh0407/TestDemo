package com.example.testdemo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


import com.example.testdemo.bean.ScoreRankBean;

import java.util.List;

public class ScoreRankAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_TITLE = 1;
    private static final int TYPE_CONTENT = 2;

    public Context mContext;
    public List<ScoreRankBean> mList;

    public ScoreRankAdapter(Context mContext, List<ScoreRankBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? TYPE_TITLE : TYPE_CONTENT;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType ==TYPE_TITLE ){
            return new HeadViewHolder(LayoutInflater.from(mContext).inflate(R.layout.rv_item_score_rank_head, parent, false));
        }
        return new ContentViewHolder(LayoutInflater.from(mContext).inflate(R.layout.rv_item_score_rank, parent, false));
    }
    @NonNull
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeadViewHolder){
            HeadViewHolder vh = (HeadViewHolder)holder;
            vh.rankTv.setText(R.string.main_rv_rank_title);
            vh.personNmeTv.setText(R.string.main_rv_name_title);
            vh.scoreTv.setText(R.string.main_rv_score_title);
            vh.departTv.setText(R.string.main_rv_depart_title);
            vh.itemView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.dark));
            return;
        }
        ContentViewHolder vh = (ContentViewHolder)holder;
        int newPosition= position-1;
        ScoreRankBean bean = mList.get(newPosition);

        vh.rankTv.setText(bean.rank+"");
        vh.personNmeTv.setText(bean.names);
        vh.scoreTv.setText(bean.score+"");
        vh.departTv.setText(bean.depart);
        vh.starImage.setVisibility(View.VISIBLE);
        if (newPosition >=0 && newPosition<=2){
            vh.starImage.setImageResource(R.drawable.star_red);
        } else if (newPosition >=3 && newPosition<=5){
            vh.starImage.setImageResource(R.drawable.star_yellow);
        }else {
            vh.rankTv.setTextColor(Color.BLACK);
            vh.starImage.setVisibility(View.GONE);
        }
        if (newPosition %2==0){
            vh.itemView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.bright));
        }else {
            vh.itemView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.dark));
        }


    }

    @Override
    public int getItemCount() {
        return mList.size()+1;

    }

    class HeadViewHolder extends RecyclerView.ViewHolder {
        private TextView rankTv;
        private TextView personNmeTv;
        private TextView scoreTv;
        private TextView departTv;


        public HeadViewHolder(View itemView) {
            super(itemView);
            rankTv = itemView.findViewById(R.id.rank_tv);
            personNmeTv = itemView.findViewById(R.id.person_name_tv);
            scoreTv = itemView.findViewById(R.id.score_tv);
            departTv = itemView.findViewById(R.id.depart_tv);
        }
    }

    class ContentViewHolder extends RecyclerView.ViewHolder {
        private TextView rankTv;
        private TextView personNmeTv;
        private ImageView starImage;
        private TextView departTv;
        private TextView scoreTv;

        public ContentViewHolder(View itemView) {
            super(itemView);
            starImage =itemView.findViewById(R.id.star_img);
            rankTv = itemView.findViewById(R.id.rank_tv);
            personNmeTv = itemView.findViewById(R.id.person_name_tv);
            scoreTv = itemView.findViewById(R.id.score_tv);
            departTv = itemView.findViewById(R.id.depart_tv);
        }
    }

}