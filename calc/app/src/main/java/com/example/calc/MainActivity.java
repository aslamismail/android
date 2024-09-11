package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        tv1=(TextView)findViewById(R.id.tv1);

    }

    public void add(View view) {
        Double en1=Double.parseDouble(n1.getText().toString());
        Double en2=Double.parseDouble(n2.getText().toString());
        Double res=en1+en2;
        tv1.setText(Double.toString(res));


    }

    public void sub(View view) {
        Double en1=Double.parseDouble(n1.getText().toString());
        Double en2=Double.parseDouble(n2.getText().toString());
        Double res=en1-en2;
        tv1.setText(Double.toString(res));

    }

    public void mul(View view) {
        Double en1=Double.parseDouble(n1.getText().toString());
        Double en2=Double.parseDouble(n2.getText().toString());
        Double res=en1*en2;
        tv1.setText(Double.toString(res));
    }
}