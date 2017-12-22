package com.example.kelvak.buildingastorefront;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton app1;
        ImageButton app2;
        TextView app2Rate = (TextView) findViewById(R.id.app2Rating);
        TextView app1Rate = (TextView) findViewById(R.id.app1Rating);
        TextView old = (TextView) findViewById(R.id.oldSoftware);

        app1 = (ImageButton) findViewById(R.id.app1);
        app2 = (ImageButton) findViewById(R.id.app2);

        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            app1Rate.setVisibility(View.GONE);
            app2Rate.setVisibility(View.GONE);
            app1.setVisibility(View.GONE);
            app2.setVisibility(View.GONE);
            old.setVisibility(View.VISIBLE);
        }



        // This creates an OnClick listener so that when app1 button is clicked, it takes you to app1Activity
        app1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, app1Activity.class));
            }
        });
        app2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, app2Activity.class));
            }
        });
    }
    protected void onResume(){
        super.onResume();
        Bundle b = getIntent().getExtras();
        //double result = b.getDouble("APP1RATE");
        //String test = getIntent().getDoubleExtra("APP1RATE");
        //app1Rate.setText(Double.toString(result));
    }
}
