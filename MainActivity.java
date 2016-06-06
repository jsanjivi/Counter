package com.example.sanjivi.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {c=savedInstanceState.getInt("num");
            TextView text1=(TextView)findViewById(R.id.textView);
            text1.setText(Integer.toString(c));
    }
    }
    public void onClick(View v)
    {
        TextView text=(TextView)findViewById(R.id.textView);
        c=Integer.parseInt(text.getText().toString());
        c=c+1;
        text.setText(Integer.toString(c));
    }
   @Override
    protected void onSaveInstanceState(Bundle outState)
{outState.putInt("num",c);
 }

}
