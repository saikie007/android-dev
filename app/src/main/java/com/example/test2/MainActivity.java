package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView  text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

    }
    public void helloworldclicked (View textview){
        EditText edtFN = findViewById(R.id.edtFirstnumber);
        EditText edtSN = findViewById(R.id.edtSecondnumber);
        int mResults =Integer.parseInt(edtFN.getText().toString()) *Integer.parseInt(edtSN.getText().toString());
        text.setText(mResults + "");

    }
}