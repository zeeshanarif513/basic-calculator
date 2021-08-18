package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText first, second;
    TextView tv;
    Button add,sub,mul,div;
    Double firstnum,secondnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById(R.id.firstnum);
        second = (EditText) findViewById(R.id.secondnum);
        tv = (TextView) findViewById(R.id.tvresult);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.Multi);
        div=(Button)findViewById(R.id.div);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        firstnum=Double.valueOf( first.getText().toString());
        secondnum=Double.valueOf( second.getText().toString());
        Double result;
        switch(v.getId()){
            case R.id.add:
                result = firstnum +secondnum;
                tv.setText(result+"");
                break;
            case R.id.sub:
                result = firstnum -secondnum;
                tv.setText(result+"");
                break;
            case R.id.Multi:
                result = firstnum *secondnum;
                tv.setText(result+"");
                break;
            case R.id.div:
                if(secondnum==0){
                    tv.setText("Division by zero");
                }
                else {
                    result = firstnum / secondnum;
                    tv.setText(result + "");
                }
                break;
        }
    }
}