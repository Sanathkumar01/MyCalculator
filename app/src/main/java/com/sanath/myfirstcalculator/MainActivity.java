package com.sanath.myfirstcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextView, editTextView2;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextView=(EditText)findViewById(R.id.edit_text1);
        editTextView2=(EditText)findViewById(R.id.edit_text2) ;
        textView2=(TextView)findViewById((R.id.text_view));
    }

    public void onButtonclickedmultiply(View view) {

        int x = Integer.parseInt(editTextView.getText().toString());
        int y = Integer.parseInt(editTextView2.getText().toString());

        int z = x * y;
        textView2.setText("" + z);

    }

    public void onButtonclickedminus(View view) {

        int x = Integer.parseInt(editTextView.getText().toString());
        int y = Integer.parseInt(editTextView2.getText().toString());

        int z = x - y;
        textView2.setText("" + z);
    }

    public void onButtonclickeddivide(View view) {

        int x = Integer.parseInt(editTextView.getText().toString());
        int y = Integer.parseInt(editTextView2.getText().toString());

        int z = x / y;
        textView2.setText("" + z);

    }

    public void onButtonClickedplus(View view) {

        int x= Integer.parseInt(editTextView.getText().toString());
        int y= Integer.parseInt(editTextView2.getText().toString());

        int z= x+y;
        textView2.setText(""+z);
    }

    public void onClickedClear(View view) {

        editTextView.setText(" ");
        editTextView2.setText(" ");
        textView2.setText("0");
    }

    public void onbuttonclickedsquare(View view) {
        int x =Integer.parseInt(editTextView.getText().toString());
        int z=x*x;
        textView2.setText(""+z);


    }

    public void onButtonClickedCube(View view) {


        int x =Integer.parseInt(editTextView.getText().toString());
        int z=x*x*x;
        textView2.setText(""+z);

    }
}
