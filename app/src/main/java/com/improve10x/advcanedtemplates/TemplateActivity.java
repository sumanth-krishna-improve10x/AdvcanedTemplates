package com.improve10x.advcanedtemplates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templates;
    public RecyclerView templatesRcv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        handleAddBtn();
        setData();
        setRecyclerView();
    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new  Intent(this,AddTemplateActivity.class);
            startActivity(intent);
        });
    }

    public void setRecyclerView() {
        templatesRcv = findViewById(R.id.template_rcv);
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templates);
        templatesRcv.setAdapter(templateAdapter);
    }

    public void setData() {
        templates = new ArrayList<>();
    }

}