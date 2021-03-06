package com.prabhakar.filltheform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText organizationName;
    EditText customerName;
    EditText mobileNumber;
    EditText email;
    EditText address;
    EditText manufacturer;
    EditText taxID;
    EditText companyID;
    ImageView submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        organizationName = findViewById(R.id.etOrganizationName);
        customerName = findViewById(R.id.etCustomerName);
        mobileNumber = findViewById(R.id.etMobileNumber);
        email = findViewById(R.id.etEmail);
        address = findViewById(R.id.etAddress);
        manufacturer = findViewById(R.id.etManufacturer);
        taxID = findViewById(R.id.etTaxID);
        companyID = findViewById(R.id.etCompanyId);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("organizationName", organizationName.getText().toString());
                intent.putExtra("customerName", customerName.getText().toString());
                intent.putExtra("mobileNumber", mobileNumber.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("manufacturer", manufacturer.getText().toString());
                intent.putExtra("taxID", taxID.getText().toString());
                intent.putExtra("companyID", companyID.getText().toString());
                startActivity(intent);
            }
        });
    }

}