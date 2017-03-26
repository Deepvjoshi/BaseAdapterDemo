package com.deepjoshi.chocopyk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {

    Context context;
    String[]dj;
    int res;
    int[] Veg;

    public CustomAdapter(Context context, int res,String[]dj, int[] Veg) {
        this.context = context;
        this.dj = dj;
        this.Veg = Veg;
        this.res=res;

//        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return Veg.length;
    }

    @Override
    public Object getItem(int position) {
        return Veg.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
       // TextView iid;
        ImageView im;
        TextView name;
    }
 
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder = new ViewHolder();
        if (convertView == null){

            convertView = LayoutInflater.from(context).inflate(res, parent, false);
       // holder.iid = (TextView) convertView.findViewById(R.id.list_line);
        holder.name = (TextView) convertView.findViewById(R.id.grid_cat);
          holder.im=(ImageView)convertView.findViewById(R.id.gris_img);
           //
        //TV1 = (TextView) convertView.findViewById(R.id.grid_cat);

        convertView.setTag(holder);
//        return convertView;
    }else

    {
        holder = (ViewHolder) convertView.getTag();
    }
        holder.name.setText(dj[position]);
holder.im.setImageResource(Veg[position]);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gridintent = new Intent(context,Ctyp.class);
                gridintent.putExtra("listquotes",position);
                context.startActivity(gridintent);
            }
        });

    return convertView;
        }
}
