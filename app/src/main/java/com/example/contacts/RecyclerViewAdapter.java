package com.example.contacts;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
Context mContext;
List<contact>mData;
Dialog mDialod;

    public RecyclerViewAdapter(Context mContext, List<contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v;
      v= LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
      final MyViewHolder vHolder=new MyViewHolder(v);
      mDialod=new Dialog(mContext);
      mDialod.setContentView(R.layout.dialog_contact);



        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              TextView dialog_name=(TextView)mDialod.findViewById(R.id.dialoge_name);
              TextView dialog_phone=(TextView)mDialod.findViewById(R.id.dialoge_phone);
              ImageView dialog_contact_img=(ImageView)mDialod .findViewById(R.id.dialog_img);
              dialog_name.setText(mData.get(vHolder.getAdapterPosition()).getName());
              dialog_phone.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
              dialog_contact_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
             Toast.makeText(mContext,"Test Cliked"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
             mDialod.show();
          }
      });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.tv_name.setText(mData.get(position).getName());
    holder.tv_phone.setText(mData.get(position).getPhone());
    holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  static  class  MyViewHolder extends RecyclerView.ViewHolder{
private LinearLayout item_contact;
private TextView tv_name;
private  TextView tv_phone;
private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact=(LinearLayout)itemView.findViewById(R.id.contact_item);
            tv_name=(TextView) itemView.findViewById(R.id.name_conact);
            tv_phone=(TextView)itemView.findViewById(R.id.phone_contact);
            img=(ImageView)itemView.findViewById(R.id.image_contact);
        }
    }
}
