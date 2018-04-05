package com.example.amir.foodapp.fragment_class.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amir.foodapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amir on 12/13/2017.
 */

public class menu_adapter extends RecyclerView.Adapter<menu_adapter.myviewholder> {

    ArrayList<Menu_model> menulist;
    OnItemClickListener onItemClickListener;


    public menu_adapter(ArrayList<Menu_model> menulist) {
        this.menulist = menulist;
    }

    @Override
    public myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_row, parent, false);
        myviewholder myViewHolder = new myviewholder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(myviewholder holder, final int position) {
        TextView Header = holder.Header;
        TextView body = holder.Body;
        ImageView image = holder.Image;

        Header.setText(menulist.get(position).getTitle());
        body.setText(menulist.get(position).getBody());
        image.setImageResource(menulist.get(position).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menulist.size();
    }


    public class myviewholder extends RecyclerView.ViewHolder {
        TextView Header, Body;
        ImageView Image;
        CardView cardView;

        public myviewholder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            Header = itemView.findViewById(R.id.header);
            Body = itemView.findViewById(R.id.body);
            Image = itemView.findViewById(R.id.image);

        }
    }
    public void setOnCardClickListner(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}

