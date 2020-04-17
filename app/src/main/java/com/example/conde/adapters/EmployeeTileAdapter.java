package com.example.conde.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.conde.R;
import com.example.conde.data.model.Employee;

import java.util.List;

public class EmployeeTileAdapter extends ArrayAdapter<Employee> {
    List<Employee> employees;
    private final Activity context;

    public EmployeeTileAdapter(@NonNull Activity context, List<Employee> employees) {
        super(context, R.layout.list_tile, employees);

        this.employees = employees;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View tile = inflater.inflate(R.layout.employee_tile, null,true);

        TextView identification = tile.findViewById(R.id.identification);
        TextView firstName = tile.findViewById(R.id.first_name);
        TextView lastName = tile.findViewById(R.id.last_name);
        TextView phone = tile.findViewById(R.id.phone);
        TextView address = tile.findViewById(R.id.address);
        TextView gender = tile.findViewById(R.id.gender);
        TextView employeeName = tile.findViewById(R.id.employee);
        TextView debt = tile.findViewById(R.id.debt);

        Employee employee = employees.get(position);

        identification.setText("Identification: "+employee.getIdentification());
        firstName.setText("First Name: "+employee.getFirstName());
        lastName.setText("Last Name: "+employee.getLastName());
        phone.setText("Phone: "+employee.getPhone());
        address.setText("Address: "+employee.getAddress());
        gender.setText("Gender: "+employee.getGender());
        employeeName.setText("Employee: "+employee.getCutomer().getFullName());
        debt.setText("Gender: "+employee.getDebt());

        return tile;
    }
}
