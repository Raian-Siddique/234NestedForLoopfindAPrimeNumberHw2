package com.example.a234nesterforloopprimenumberhw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //    ============Hooking java with xml=============
    EditText ed1,ed2;
    Button button;
    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //=============find with id======================
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        button=findViewById(R.id.button);
        tvDisplay=findViewById(R.id.tvDisplay);


        // ============================For Loop srarts Here====================

        button.setOnClickListener(new View.OnClickListener() {    // Making a Button Functional
            @Override
            public void onClick(View v) {


//
                int number1 = Integer.parseInt(ed1.getText().toString());
                int number2 = Integer.parseInt(ed2.getText().toString());

tvDisplay.setText("");                      //making textview empty everytime with this line
for (int i=number1;i<=number2;i++){         //first value giving by the user will increase by 1 every time the loop runs
    int count=0;                            // setting the value of count zero every time.
    for (int j=2; j<i; j++){               // Before entering this for loop everytime count is 0 .
        if (i%j==0){                       // if the number is divisible with out 1 or the number itself is not a prime number
            count++;                       // so id its divisible by any of that number we don't want that number because is not a prime, because we want to show only prime number.
            break;                         // so if not a prime number then count will increase by 1 with count++ command and then break command will break the for loop.
        }
    }
    if(count==0){                          // if the count = 0 then the line will print that number because if count==0 then its a prime number.
        tvDisplay.append(" "+i);
    }
}
// ======================for loop ends=======

            }});

    }}