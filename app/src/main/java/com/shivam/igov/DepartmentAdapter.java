package com.shivam.igov;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentAdapter.DepartmentViewHolder>{
    private class DepartmentViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView thumbnail;
        private DepartmentViewHolder(View view){
            super(view);
            this.title =(TextView) view.findViewById(R.id.title);
            this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }
}
