package com.example.mywork_lt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.MyViewHolder> {
    private String[] name={"真真","怡宝","瑶瑶","雨晴","桐"};
    private int[] picture={R.drawable.eat,R.drawable.hug,R.drawable.imagine,R.drawable.mad,R.drawable.dream};
    private String[] age={"28岁，一位帅气的美男子","25岁，一位美丽的奇女子","26岁，一位善良的美女子","22岁，一名辛勤的打工人","20岁，秃头且码代码中"};
    private Context context;

    public myadapter(List<String>list,Context context) {
        this.name=name;
        this.picture=picture;
        this.age=age;
        this.context=context;
    }
    @NonNull
    @Override
    public myadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder =new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.MyViewHolder holder, int position) {
        holder.textView11.setText(name[position]);
        holder.textView12.setText(age[position]);
        holder.imageView11.setImageResource(picture[position]);//当前的数组索引
    }

    @Override
    public int getItemCount() {
        return name.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView11;
        TextView textView12;
        ImageView imageView11;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView11=itemView.findViewById(R.id.textView11);
            textView12=itemView.findViewById(R.id.textView12);
            imageView11=itemView.findViewById(R.id.imageView11);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=getAdapterPosition();
                    switch (position){
                        case 0:
                            Intent intent=new Intent(itemView.getContext(),MainActivity2.class);
                            context.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1=new Intent(itemView.getContext(),MainActivity2.class);
                            context.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2=new Intent(itemView.getContext(),MainActivity2.class);
                            context.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3=new Intent(itemView.getContext(),MainActivity2.class);
                            context.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4=new Intent(itemView.getContext(),MainActivity2.class);
                            context.startActivity(intent4);
                            break;


                    }
                }
            });
        }
    }
}