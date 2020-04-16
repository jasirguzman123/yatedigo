package com.example.yatedigo.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.yatedigo.R;
import com.example.yatedigo.adapters.EmployeeTileAdapter;
import com.example.yatedigo.adapters.ListTileAdapter;
import com.example.yatedigo.data.model.Customer;
import com.example.yatedigo.data.model.Employee;
import com.example.yatedigo.ui.forms.CustomerForm;

import java.util.ArrayList;
import java.util.List;

public class Employees extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Employees");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        EmployeeTileAdapter adapter = new EmployeeTileAdapter(this, Employee.sampleEmployees());
        list = findViewById(R.id.list);
        list.setAdapter(adapter);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Employees.this, CustomerForm.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
