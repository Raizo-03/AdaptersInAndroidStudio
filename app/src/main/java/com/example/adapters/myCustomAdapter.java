package com.example.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class myCustomAdapter extends BaseAdapter{
    private Context context;
    private String[] items;


    public myCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;


    }

    @Override
    public int getCount() {
        return items.length; //Returns the number of items in the source
    }

    @Override
    public Object getItem(int position) {
        return items[position]; //Returns unique identifier for the item at a given position
    }

    @Override
    public long getItemId(int position) {
        return position; //Returns unique identifier for the item at a given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            //Is a recycled View that you can reuse to improve performance of your list
            convertView = LayoutInflater.from(context).inflate(R.layout.my_list_item, parent, false);

        }else{
            //Reusing the view (that's recycled)
            holder = (ViewHolder) convertView.getTag();
        }



        return null; //Displays the data at the specified position in the adapter
    }


    static class ViewHolder {
        //Hold references to the views within the item layout
        TextView textView;

    }
}
