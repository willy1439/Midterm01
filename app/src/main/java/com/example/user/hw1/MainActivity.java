package com.example.user.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputScore;
    private Button mok;
    private TextView mtxtR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputScore = (EditText) findViewById(R.id.input);
        mok = (Button) findViewById(R.id.button);
        mtxtR = (TextView) findViewById(R.id.output);

        mok.setOnClickListener(buttonOnClick);
    }

    private View.OnClickListener buttonOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int grade = Integer.parseInt(inputScore.getText().toString());
            String strSug = getString(R.string.output);
            if(grade < 0)
                strSug += getString(R.string.x);
            else if(grade >= 0 && grade <= 59)
                strSug += getString(R.string.f);
            else if(grade >= 60 && grade <= 69)
                strSug += getString(R.string.d);
            else if(grade >= 70 && grade <= 79)
                strSug += getString(R.string.c);
            else if(grade >= 80 && grade <= 89)
                strSug += getString(R.string.b);
            else if(grade >= 90 && grade <= 100)
                strSug += getString(R.string.a);
            else if(grade > 100)
                strSug += getString(R.string.x);

            mtxtR.setText(strSug);
        }

    };
}
