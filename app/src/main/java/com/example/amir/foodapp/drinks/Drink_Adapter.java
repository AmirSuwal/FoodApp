package com.example.amir.foodapp.drinks;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amir.foodapp.R;
import com.example.amir.foodapp.fragment_class.adapter.*;
import com.example.amir.foodapp.fragment_class.adapter.OnItemClickListener;

import java.util.ArrayList;

/**
 * Created by Amir on 12/15/2017.
 */

public class Drink_Adapter extends RecyclerView.Adapter<Drink_Adapter.drinkviewholder> {
    ArrayList<Drink_Model> drinklist;
    OnItemClickListener onItemClickListener;

    public Drink_Adapter(ArrayList<Drink_Model> drinklist) {
        this.drinklist = drinklist;
    }



    @Override
    public drinkviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_row_drinks, parent, false);
        drinkviewholder drinkviewholder = new drinkviewholder(view);
        return drinkviewholder;
    }

    @Override
    public void onBindViewHolder(drinkviewholder holder, final int position) {
        ImageView image = holder.Image;
        TextView title = holder.Title;
        TextView detail = holder.Details;
        TextView price = holder.Price;

        image.setImageResource(drinklist.get(position).getImage());
        title.setText(drinklist.get(position).getTitle());
        detail.setText(drinklist.get(position).getDetails());
        price.setText(Integer.toString(drinklist.get(position).getPrice()));




        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return drinklist.size();
    }

    public class drinkviewholder extends ViewHolder {
        TextView Title, Details, Price;
        ImageView Image;
        CardView cardView;

        public drinkviewholder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            Image = itemView.findViewById(R.id.image);
            Title = itemView.findViewById(R.id.header);
            Details = itemView.findViewById(R.id.detail);
            Price = itemView.findViewById(R.id.price);

        }
    }

    public void setOnCardClickListner(com.example.amir.foodapp.fragment_class.adapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
