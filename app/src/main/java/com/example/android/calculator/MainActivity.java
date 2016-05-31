package com.example.android.calculator;


import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    EditText etNum3;
    EditText etNum4;



public void total1(int etNum1,int etNum2,String text ){

    int a= etNum1 - etNum2 ;

}

    public void total2(int etNum3,int etNum4 ){

        int a= etNum3 - etNum4 ;
        int c = a * 100;
        int d = c;

    }

    private int submitorder(int total1, int total2 ) {

        int t =  total2 *100 ;
         int p = t;

        return p - total1;
    }





    }
