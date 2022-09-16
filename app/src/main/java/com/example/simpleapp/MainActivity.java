package com.example.simpleapp;

import android.app.appsearch.RemoveByDocumentIdRequest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;
import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    private TextView monitor;

    private Button numbers[] = new Button[11];
    private Button operations[] = new Button[7];
    String math = "";
    int c = 0;
    String number = "";
    double result = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor = findViewById(R.id.monitor);
        numbers[0] = findViewById(R.id.zero);
        numbers[1] = findViewById(R.id.one);
        numbers[2] = findViewById(R.id.two);
        numbers[3] = findViewById(R.id.three);
        numbers[4] = findViewById(R.id.four);
        numbers[5] = findViewById(R.id.five);
        numbers[6] = findViewById(R.id.six);
        numbers[7] = findViewById(R.id.seven);
        numbers[8] = findViewById(R.id.eight);
        numbers[9] = findViewById(R.id.nine);
        numbers[10] = findViewById(R.id.point);

        operations[0] = findViewById(R.id.Remove);
        operations[1] = findViewById(R.id.percent);
        operations[2] = findViewById(R.id.devide);
        operations[3] = findViewById(R.id.multiply);
        operations[4] = findViewById(R.id.minus);
        operations[5] = findViewById(R.id.plus);
        operations[6] = findViewById(R.id.submit);

        numbers[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="0";
                number += "0";
                monitor.setText(math);
            }
        });
        numbers[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="1";
                number += "1";
                monitor.setText(math);
            }
        });
        numbers[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="2";
                number += "2";
                monitor.setText(math);
            }
        });

        numbers[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="3";
                number += "3";
                monitor.setText(math);
            }
        });

        numbers[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="4";
                number += "4";
                monitor.setText(math);
            }
        });

        numbers[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="5";
                number += "5";
                monitor.setText(math);
            }
        });

        numbers[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="6";
                number += "6";
                monitor.setText(math);
            }
        });

        numbers[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="7";
                number += "7";
                monitor.setText(math);
            }
        });

        numbers[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="8";
                number += "8";
                monitor.setText(math);
            }
        });

        numbers[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+="9";
                number += "9";
                monitor.setText(math);

            }
        });

        numbers[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math+=".";
                number += ".";
                monitor.setText(math);
            }
        });

        operations[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math ="";
                number = "";
                monitor.setText(math);
            }
        });

        operations[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = prev(Double.parseDouble(number),c,result);
                number = "";
                c=4;
                math +="%";
                monitor.setText(math);

            }
        });

        operations[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = prev(Double.parseDouble(number),c,result);
                number = "";
                c=3;
                math +="/";
                monitor.setText(math);

            }
        });

        operations[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = prev(Double.parseDouble(number),c,result);
                number = "";
                c=2;
                math +="*";
                monitor.setText(math);

            }
        });

        operations[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = prev(Double.parseDouble(number),c,result);
                number = "";
                c=1;
                math +="-";
                monitor.setText(math);
            }
        });

        operations[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                result = prev(Double.parseDouble(number),c,result);
                number = "";
                c = 0;
                math +="+";
                monitor.setText(math);

            }
        });

        operations[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = prev(Double.parseDouble(number),c,result);
                number = "";
                math = "";
                c=0;
                monitor.setText(result + "");
                result = 0.0;
            }
        });

    }

    private double prev(double number, int c, double result){
        if(c == 0){
            return result + number;
        }
        else if(c == 1){
            return result - number;
        }
        else if(c == 2){
            return  result * number;
        }
        else if(c == 3){
            return  result / number;
        }
        else if(c == 4){
            return result % number;
        }
        else
            return -1;
    }

}