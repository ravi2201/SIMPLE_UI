package com.example.ravi.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView t2;
    public Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2=(TextView)findViewById(R.id.t2);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2= (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Button b2 clicked",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        t2.setText("you clicked button 1");


    }
    public void changeText(View v ){
       t2.setText("You clicked button 2");
    }
}
