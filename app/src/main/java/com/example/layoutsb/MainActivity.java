package com.example.layoutsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_act_1);
        //setContentView(R.layout.activity_main_act_2);
        //setContentView(R.layout.activity_main_act_3);
        //setContentView(R.layout.activity_main_act_4);
        //setContentView(R.layout.activity_main_act_5);
        setContentView(R.layout.activity_main_act_6);
        //setContentView(R.layout.activity_main_act_7);


        /**
         * ACTIVIDAD 5
         */
        // Obtenemos los spinners por su ID.
        Spinner spMarStatus = this.findViewById(R.id.marStatusSpinner);
        Spinner spCharge = this.findViewById(R.id.chargeSpinner);

        // Creamos los arrays de listas.
        List<String> marStatusList = new ArrayList<>();
        List<String> chargeList = new ArrayList<>();

        // Obtenemos el layout de spinner item para mostrar el diseño de los mismos.
        ArrayAdapter<String> adpMarStatus = new ArrayAdapter<>(this, R.layout.spinner_item, marStatusList);
        ArrayAdapter<String> adpCharge = new ArrayAdapter<>(this, R.layout.spinner_item, chargeList);

        // Añadimos items al array.
        marStatusList.add("Soltero");
        marStatusList.add("Divorciado");
        marStatusList.add("Viudo");
        marStatusList.add("Casado");
        marStatusList.add("Matrimonio extraterrestrial");

        chargeList.add("IT");
        chargeList.add("Combate");
        chargeList.add("Transporte");
        chargeList.add("Telecomunicaciones");
        chargeList.add("Traductor");
        chargeList.add("Recién llegado");

        // Los mostrarmos.
        spMarStatus.setAdapter(adpMarStatus);
        spCharge.setAdapter(adpCharge);

    }

}