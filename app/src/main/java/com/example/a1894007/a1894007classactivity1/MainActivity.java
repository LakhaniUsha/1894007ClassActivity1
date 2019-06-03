package com.example.a1894007.a1894007classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.design.widget.Snackbar;



public class MainActivity extends AppCompatActivity {


    EditText edt_fname,edt_lname, edt_email, edt_psw;
    Button btn_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_fname = findViewById(R.id.edittxt_fname);
        edt_lname = findViewById(R.id.edittxt_lname);

        edt_email = findViewById(R.id.editText_email);
        edt_psw = findViewById(R.id.editText_password);

        btn_sub =findViewById(R.id.button_submit);


       final Toast tst = Toast.makeText(getApplicationContext(),"Thank you", Toast.LENGTH_SHORT);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fname = edt_fname.getText().toString();
                String lname = edt_lname.getText().toString();
                String email = edt_email.getText().toString();
                String psw = edt_psw.getText().toString();


                Toast.makeText(getApplicationContext(),edt_fname.getText().toString(), Toast.LENGTH_SHORT).show();

                tst.setText("Thank you");
                tst.show();

                Snackbar snackbar = Snackbar.make(v, "Succefully submit", Snackbar.LENGTH_LONG);
                snackbar.show();


            }
        });

    }
}
