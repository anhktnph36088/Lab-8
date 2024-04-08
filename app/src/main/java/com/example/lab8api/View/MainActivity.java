package com.example.lab8api.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.lab8.Adapter.product_Adapter;
import com.example.lab8.Models.Product;
import com.example.lab8.R;
import com.example.lab8.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Product> list = new ArrayList<>();
    private product_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new Product("prd1", "meo", "bmm", "BMW", 4.5, 2.99, R.drawable.chomeoo));
        adapter = new product_Adapter(list, this);
        binding.rcvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rcvProduct.setAdapter(adapter);

    }
}