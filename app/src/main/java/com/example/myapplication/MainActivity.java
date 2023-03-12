package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


  EditText etxt;
  Button btn;

    public void convert(){
        String amountDollar = etxt.getText().toString();
        if(amountDollar.equals("")){
            Toast.makeText(this,"entrez un numero valide ",Toast.LENGTH_SHORT).show();
        }else {
            Double amountDollarsDbl = Double.parseDouble(amountDollar);
            Double amountDHDbl = amountDollarsDbl * 10.41;
                String amountDH = amountDHDbl.toString();
                Toast.makeText(this,"prix en Dhs est "+amountDH,Toast.LENGTH_SHORT).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        etxt=findViewById(R.id.my_edittext);
        btn=findViewById(R.id.btn_cvrt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });


    }

}