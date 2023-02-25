package com.samyrat.alerdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Context
        // Activity Context
        // App Context
        //getApplicationContext();

        Toast.makeText(this,"Tost Massage",Toast.LENGTH_LONG).show();

    }
    public void save (View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("SAVE");
        alert.setMessage("ARE YOU SURE");
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //SAVE
                Toast.makeText(getApplicationContext(), "SAVED", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "NOT SAVED", Toast.LENGTH_SHORT).show();
            }
        });
        alert.show();
    }
}