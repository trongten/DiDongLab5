package com.example.lab5;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;


public class DonutAdapter extends BaseAdapter{

    private Context context;
    private int idLayout;
    private List<Donut> listDonut;
    private int positionSelect = -1;

    public DonutAdapter(Context context, int idLayout, List<Donut> listLanguage) {
        this.context = context;
        this.idLayout = idLayout;
        this.listDonut = listLanguage;
    }

    @Override
    public int getCount() {
        if (listDonut.size() != 0 && !listDonut.isEmpty()) {
            return listDonut.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvDonutName = (TextView) convertView.findViewById(R.id.textView3);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView3);
        TextView tvDonutDep = (TextView) convertView.findViewById(R.id.textView4);
        TextView tvDonutPrice = (TextView) convertView.findViewById(R.id.textView5);

        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout);
        final Donut donut = listDonut.get(position);

        if (listDonut != null && !listDonut.isEmpty()) {
            tvDonutName.setText(donut.getName());
            tvDonutDep.setText(donut.getDep());
            tvDonutPrice.setText(donut.getPrice());
            imageView.setImageResource(donut.getId());

        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context,detail_item.class);
                Donut a = listDonut.get(position);

                intent.putExtra("name", a.getName());
                intent.putExtra("dep", a.getDep());
                intent.putExtra("price", a.getPrice());
                intent.putExtra("id", a.getId());

                context.startActivity(intent);


            }
        });


        return convertView;
    }

}
