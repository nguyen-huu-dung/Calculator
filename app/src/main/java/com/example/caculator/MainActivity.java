package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.attribute.AttributeView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private Button bAdd, bSub, bMul, bDiv, bDot, bPms, bEqual;
    private TextView tv_result;
    private TextView edt_view;
    int num_a, ans;
    boolean begin_flag, equal_flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();
        ans = 0;
        num_a = 0;
        begin_flag = true;
        equal_flag = false;
    }
    public void initWidget(){
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bAdd = (Button) findViewById(R.id.bAdd);
        bSub = (Button) findViewById(R.id.bSub);
        bMul = (Button) findViewById(R.id.bMul);
        bDiv = (Button) findViewById(R.id.bDiv);
        bDot = (Button) findViewById(R.id.bDot);
        bPms = (Button) findViewById(R.id.bPms);
        bEqual = (Button) findViewById(R.id.bEqual);
        tv_result =  findViewById(R.id.tv_result);
        edt_view =  findViewById(R.id.edt_view);
    }
    public void setEventClickView(){
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bPms.setOnClickListener(this);
        bEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.b0){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 0;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b1){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 1;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b2){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 2;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b3){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 3;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b4){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 4;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b5){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 5;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b6){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 6;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b7){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 7;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b8){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 8;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.b9){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 9;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.bCE){
            num_a = 0;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.bC){
            num_a = 0;
            ans = 0;
            tv_result.setText("0");
            edt_view.setText("");
            begin_flag = true;
        }
        if(id == R.id.bBS){
            num_a = num_a/10;
            tv_result.setText(String.valueOf(num_a));
        }
        if(id == R.id.bAdd){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = edt_view.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            tv_result.setText("");
            edt_view.setText(String.valueOf(ans) + " +");
        }
        if(id == R.id.bSub){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = edt_view.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            tv_result.setText("");
            edt_view.setText(String.valueOf(ans) + " -");
        }
        if(id == R.id.bMul){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = edt_view.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            tv_result.setText("");
            edt_view.setText(String.valueOf(ans) + " x");
        }
        if(id == R.id.bDiv){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = edt_view.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            tv_result.setText("");
            edt_view.setText(String.valueOf(ans) + " :");
        }
        if(id == R.id.bEqual){
            if(num_a != 0){
                String temp = edt_view.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            edt_view.setText("");
            tv_result.setText(String.valueOf(ans));
            num_a = 0;
            equal_flag = true;
        }



    }
}
