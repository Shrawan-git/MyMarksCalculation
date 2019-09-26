package com.mygame.mymarkscalculation.np;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private Button btn;
    private TextView tv;
    private TextView cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        cap = findViewById(R.id.cap);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (et1.getText().toString().length() == 0) {
                    et1.setText("0");
                }

                if (et2.getText().toString().length() == 0) {
                    et2.setText("0");
                }
                if (et3.getText().toString().length() == 0) {
                    et3.setText("0");
                }
                if (et4.getText().toString().length() == 0) {
                    et4.setText("0");
                }
                String name = et1.getText().toString();
                int num1 = Integer.parseInt(et2.getText().toString());
                int num2 = Integer.parseInt(et3.getText().toString());
                int num3 = Integer.parseInt(et4.getText().toString());

                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");

                float per = num1 + num2 + num3 / 3;

                tv.append(System.lineSeparator());
                tv.append(name + " Percentage(%) " +per);

            }
        });
    }
}


