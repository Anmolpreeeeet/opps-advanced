package com.example.mortezasaadat.app29;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtPolymorphism = (TextView) findViewById(R.id.txtPolymorphism);

        LifeInsurance[] lifeInsurances = new LifeInsurance[3];
        lifeInsurances[0] = new Student("John", "Android Development", 1000);
        lifeInsurances[1] = new Boxing("Boxing", "Fighting by using only hands", "Boxing Uniform",
                1000, 800, 2000, 5000, 6000);
        lifeInsurances[2] = new KickBoxing("Kick Boxing", "Fighting by punching and kicking",
                "Kick Boxing Uniform", 2000, 3000, 4000, 7000,
                3000, 5000, 2000);



        String oldTxtPolymorphism;
        for (LifeInsurance insuranceObject : lifeInsurances) {

            oldTxtPolymorphism = txtPolymorphism.getText().toString();

            txtPolymorphism.setText(String.format(oldTxtPolymorphism + "%s%n%s: %f%n%n%n",
                    insuranceObject.toString(), "Life Insurance Cost",
                    insuranceObject.evaluateCostOfInsurance()));
        }





    }


}
