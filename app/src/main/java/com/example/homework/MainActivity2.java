package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.homework.model.Product;

public class MainActivity2 extends AppCompatActivity {

    TextView dataProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dataProduct = findViewById(R.id.dataProduct);

        Bundle bundle = getIntent().getExtras();

        Product product = bundle.getParcelable("addProduct");

        dataProduct.setText(product.toString());

    }
}