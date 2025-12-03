package com.marwadi.explicit_ex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class design1 extends AppCompatActivity {

    TextView t_name, t_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_design1);
        t_contact = findViewById(R.id.d1_t_contact);
        t_name = findViewById(R.id.d1_t_name);

        Intent intent = getIntent();
        t_contact.setText(intent.getStringExtra("contact"));
        t_name.setText(intent.getStringExtra("name"));


    }
}