package com.example.kashish.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2;
    int n = 0;
    String str = "";
    boolean plus, minus, div, mul;
    double num1=0,num2=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.text);
        t2 = findViewById(R.id.textView2);

    }

    public void del(View view){
        str="";
        t1.setText("");
        t2.setText("");
    }
    public void num(View view){
        int id= view.getId();
        if(id==R.id.button1){
            str+=1;
            t1.append(1+"");
        }else if(id==R.id.button5){
            str+=2;
            t1.append(2+"");
        }else if(id==R.id.button7){
            str+=3;
            t1.append(3+"");
        }else if(id==R.id.button3){
            str+=4;
            t1.append(4+"");
        }else if(id==R.id.button2){
            str+=5;
            t1.append(5+"");
        }else if(id==R.id.button){
            str+=6;
            t1.append(6+"");
        }else if(id==R.id.button15){
            str+=7;
            t1.append(7+"");
        }else if(id==R.id.button14){
            str+=8;
            t1.append(8+"");
        }else if(id==R.id.button13){
            str+=9;
            t1.append(9+"");
        }else if(id==R.id.button16){
            str+='+';
            t1.append("+");
            plus=true;
        }else if(id==R.id.button12){
            str+='-';
            t1.append("-");
            minus=true;
        }else if(id==R.id.button4){
            str+='*';
            t1.append("*");
            mul=true;
        }else if(id==R.id.button11){
            str+='/';
            t1.append("/");
            div=true;
            }
        else if(id==R.id.button10){
            str+='.';
            t1.append(".");
        }
    }
    public void cal (View view){
        String str1="",str2="";
        int i=0;
        for( i=0;i<str.length();i++){
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
                break;
            }

                str1+=str.charAt(i);
        }
        i++;
        for( ;i<str.length();i++){
            str2+=str.charAt(i);
        }

        num1=Double.parseDouble(str1);
        num2=Double.parseDouble(str2);

        if(plus==true){
            result=num1+num2;
            t2.setText(result+"");
        }else if(minus==true){
            result=num1-num2;
            t2.setText(result+"");
        }else if(mul==true){
            result=num1*num2;
            t2.setText(result+"");
        }else if(div==true){
            result=num1/num2;
            t2.setText(result+"");
        }
    }
}
