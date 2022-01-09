package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.homework.model.Product;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Spinner currencySp, productTypeSp, daysp, monthSp, yearSp;
    EditText productNameEd, productPriceEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        btn = findViewById(R.id.addProductbtn);
        currencySp = findViewById(R.id.currencysp);
        productTypeSp = findViewById(R.id.productTypeSp);
        daysp = findViewById(R.id.daysp);
        monthSp = findViewById(R.id.monthSp);
        yearSp = findViewById(R.id.yearSp);
        productNameEd = findViewById(R.id.productNameEd);
        productPriceEd = findViewById(R.id.productPriceEd);

        btn.setOnClickListener(v -> {

            String productName = productNameEd.getText().toString();
            String productPrice = productPriceEd.getText().toString();
            String currency = (String) currencySp.getSelectedItem();
            String productType = (String) productTypeSp.getSelectedItem();
            String day = (String) daysp.getSelectedItem();
            String month = (String) monthSp.getSelectedItem();
            String year = (String) yearSp.getSelectedItem();

            Product product = new Product(productName, productPrice, currency, productType, day, month, year);

            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("addProduct", product);
            startActivity(i);

        });
    }
}