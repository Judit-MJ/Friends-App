package com.logixspace.friendsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        EditText ed1,ed2,ed3,ed4;
        AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.uname);
        ed2=(EditText) findViewById(R.id.pass);
        ed3=(EditText) findViewById(R.id.frnd);
        ed4=(EditText) findViewById(R.id.desc);
        b1=(AppCompatButton) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUsername=ed1.getText().toString();
                String getPassword=ed2.getText().toString();
                String getFriend=ed3.getText().toString();
                String getDescrip=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getUsername+" "+getPassword+" "+getFriend+" "+getDescrip,Toast.LENGTH_LONG).show();
            }
        });

    }
}