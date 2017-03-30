package com.shivam.igov;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentAdapter.DepartmentViewHolder> {

    private Context mContext;
    private List<Department> departmentList;

    public DepartmentAdapter(Context mContext, List<Department> departmentList) {
        this.mContext = mContext;
        this.departmentList = departmentList;
    }

    @Override
    public DepartmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_card, parent, false);
        return new DepartmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DepartmentViewHolder holder, int position) {
        final Department department = departmentList.get(position);
        holder.tv_title.setText(department.getDepartment());

        Glide.with(mContext).load(department.getImage_src())
                .placeholder(R.drawable.ic_temp_image)
                .error(R.drawable.ic_temp_image)
                .dontAnimate()
                .into(holder.iv_thumbnail);

        holder.iv_thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SubDepartmentActivity.class);
                intent.putExtra("CATEGORY", department.getDepartment());
                ((Activity) mContext).finish();
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return departmentList.size();
    }

    public class DepartmentViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;
        private ImageView iv_thumbnail;

        public DepartmentViewHolder(View view) {
            super(view);
            this.tv_title = (TextView) view.findViewById(R.id.tv_title);
            this.iv_thumbnail = (ImageView) view.findViewById(R.id.iv_thumbnail);
        }
    }
}
