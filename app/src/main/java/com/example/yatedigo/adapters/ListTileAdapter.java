package com.example.yatedigo.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.yatedigo.R;
import com.example.yatedigo.data.model.Customer;

import java.util.List;

public class ListTileAdapter extends ArrayAdapter<Customer> {
    List<Customer> customers;
    private final Activity context;

    public ListTileAdapter(@NonNull Activity context, List<Customer> customers) {
        super(context, R.layout.list_tile, customers);

        this.customers = customers;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View tile = inflater.inflate(R.layout.list_tile, null,true);

        TextView identification = tile.findViewById(R.id.identification);
        TextView firstName = tile.findViewById(R.id.first_name);
        TextView lastName = tile.findViewById(R.id.last_name);
        TextView phone = tile.findViewById(R.id.phone);
        TextView address = tile.findViewById(R.id.address);
        TextView gender = tile.findViewById(R.id.gender);

        Customer customer = customers.get(position);

        identification.setText("Identification: "+customer.getIdentification());
        firstName.setText("First Name: "+customer.getFirstName());
        lastName.setText("Last Name: "+customer.getLastName());
        phone.setText("Phone: "+customer.getPhone());
        address.setText("Address: "+customer.getAddress());
        gender.setText("Gender: "+customer.getGender());

        return tile;
    }
}
