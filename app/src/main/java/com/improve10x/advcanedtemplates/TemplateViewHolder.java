package com.improve10x.advcanedtemplates;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TemplateViewHolder extends RecyclerView.ViewHolder {

    public TextView templateIdTxt;
    public TemplateViewHolder(@NonNull View itemView) {
        super(itemView);
        templateIdTxt = itemView.findViewById(R.id.template_id_txt);
    }
}
