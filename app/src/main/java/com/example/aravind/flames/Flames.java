package com.example.aravind.flames;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class Flames extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flames);



    }


    public void onButtonClick(View v) {
        EditText n1 = findViewById(R.id.name1);
        EditText n2 = findViewById(R.id.name2);
        TextView r = findViewById(R.id.result);
        int l1, l2, i, j, m,s2,s3, flag = 0;
        String a = n1.getText().toString();
        String b = n2.getText().toString();


        l1 = a.length();
        l2 = b.length();
        s2 = l1+l2;
        char[] a2 = a.toCharArray();
        char[] b2 = b.toCharArray();
        for (i = 0; i < l1; i++) {

                for (j = 0; j < l2; j++) {

                        if (a2[i] == b2[j]) {
                            flag++;
                            b2[j] = '*';
                            break;
                        }

                }

        }
        s3 = s2-(flag+flag);
        m = s3 % 6;

        if (m == 2 || m == 4 || m == 7 || m == 9) {
            r.setText(n1.getText().toString() + " and " + n2.getText().toString() + " is Enemy");
        } else {
            if (m == 3 || m == 5 || m == 14 || m == 16 || m == 18) {
                r.setText(n1.getText().toString() + " and " + n2.getText().toString() + "is Friend");
            } else {
                if (m == 8 || m == 12 || m == 17) {
                    r.setText(n1.getText().toString() + " and " + n2.getText().toString() + "is Attraction");
                } else {
                    if (m == 10) {
                        r.setText(n1.getText().toString() + " and " + n2.getText().toString() + "is Love");
                    } else {
                        if (m == 6 || m == 11 || m == 15) {
                            r.setText(n1.getText().toString() + " and " + n2.getText().toString() + "is Marriage");
                        } else {
                            r.setText(n1.getText().toString() + " and " + n2.getText().toString() + "is Sister/Brother");
                        }
                    }
                }
            }
        }

    }






}
