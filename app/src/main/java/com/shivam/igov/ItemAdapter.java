package com.shivam.igov;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Application application, ArrayList<Item> items) {
        super(application, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null)
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView tv_item_view = (TextView) listView.findViewById(R.id.tv_item_title);
        Item item = getItem(position);

        tv_item_view.setText(item.getTitle());

        return listView;
    }
}
