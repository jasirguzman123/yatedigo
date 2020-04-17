package com.example.yatedigo.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.yatedigo.R;
import com.example.yatedigo.ui.sections.Customers;
import com.example.yatedigo.ui.sections.Employees;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Conde");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.customersMenuOption:
                goTo(Customers.class);
                return true;
            case R.id.employeesMenuOption:
                goTo(Employees.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void goTo(Class _class) {
        Intent intent = new Intent(Home.this, _class);
        startActivity(intent);
    }
}
