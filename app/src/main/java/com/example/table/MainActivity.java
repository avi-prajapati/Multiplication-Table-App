package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    Button button3;
    TextView textView4;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();

        editTextNumber=findViewById(R.id.editTextNumber);
        button3=findViewById(R.id.button3);
        textView4=findViewById(R.id.textView4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(editTextNumber.getText().toString());
                result="";
                for(int i=1;i<11;i++) {
                    result+=num+" x "+i+" = "+num*i+"\n";
                    textView4.setText(result);

                }
            }
        });

    }
}