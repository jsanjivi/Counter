package com.example.sanjivi.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v)
    {
        TextView text=(TextView)findViewById(R.id.textView);
        c=Integer.parseInt(text.getText().toString());
        c=c+1;
        text.setText(Integer.toString(c));
    }
}
