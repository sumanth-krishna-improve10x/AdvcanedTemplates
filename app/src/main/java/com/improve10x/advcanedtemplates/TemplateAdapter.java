package com.improve10x.advcanedtemplates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateViewHolder> {
    ArrayList<Template> templatesList;

    public void setData (ArrayList<Template>templateArrayList) {
        templatesList = templateArrayList;

    }
    @NonNull
    @Override
    public TemplateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item,parent,false);
        TemplateViewHolder templateViewHolder = new TemplateViewHolder(view);
        return templateViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplateViewHolder holder, int position) {
        Template template = templatesList.get(position);
        holder.templateIdTxt.setText(template.templateId);
    }

    @Override
    public int getItemCount() {
        return templatesList.size();
    }
}
