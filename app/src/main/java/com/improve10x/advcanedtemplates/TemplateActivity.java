package com.improve10x.advcanedtemplates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        templatesRcv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter.setData(templates);
        templatesRcv.setAdapter(templateAdapter);
    }

    public void setData() {
        templates = new ArrayList<>();
        Template template = new Template();
        template.messageTxt = "Hi,Welcome to My world";
        templates.add(template);

        Template template1 = new Template();
        template1.messageTxt = "MySelf Manjula SumanthKrishna";
        templates.add(template1);

        Template template2 = new Template();
        template2.messageTxt = "I'm from Nandyla";
        templates.add(template2);

    }

}