package com.example.trapesium;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText A, B, T, S1, S2;
    Button BHL, BHK;
    TextView HL, HK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A= (EditText)findViewById(R.id.editA);
        B= (EditText)findViewById(R.id.editB);
        T= (EditText)findViewById(R.id.editT);
        S1= (EditText)findViewById(R.id.editS1);
        S2= (EditText)findViewById(R.id.editS2);
        BHL= (Button)findViewById(R.id.buttonhasilluas);
        BHK= (Button)findViewById(R.id.buttonhasilkeliling);
        HL= (TextView)findViewById(R.id.textViewHasilL);
        HK= (TextView)findViewById(R.id.textViewHasilK);

        BHL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2,bilangan3, hluas, rumus1, rumus2;
                rumus1 = 1;
                rumus2 = 2;
                bilangan1=Double.valueOf(A.getText().toString().trim());
                bilangan2=Double.valueOf(B.getText().toString().trim());
                bilangan3=Double.valueOf(T.getText().toString().trim());

                hluas = rumus1/rumus2 * (bilangan2 + bilangan1) * bilangan3;

                String hL = String.valueOf(hluas);

                HL.setText(hL);


            }
        });

        BHK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2, bilangan4, bilangan5, hkeliling;

                bilangan1=Double.valueOf(A.getText().toString().trim());
                bilangan2=Double.valueOf(B.getText().toString().trim());
                bilangan4=Double.valueOf(S1.getText().toString().trim());
                bilangan5=Double.valueOf(S2.getText().toString().trim());

                hkeliling = bilangan4 + bilangan5 + bilangan1 + bilangan2;

                String hK = String.valueOf(hkeliling);

                HK.setText(hK);

            }
        });


    }
}