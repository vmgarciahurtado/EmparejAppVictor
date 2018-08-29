package com.example.worldskills.emparejapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.worldskills.emparejapp.R;

import java.util.ArrayList;

public class ConfiguracionActivity extends AppCompatActivity {

    String selecciona;
    ArrayList arrayTipo;
    Spinner listaTipo;
    EditText campoTiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        arrayTipo = new ArrayList();
        arrayTipo.add("¡¡ Seleccione un tipo de juego !!");
        arrayTipo.add("Juego normal");
        arrayTipo.add("Juego con tiempo");

        campoTiempo = findViewById(R.id.campoTiempoJuego);
        campoTiempo.setVisibility(View.INVISIBLE);

        listaTipo = findViewById(R.id.spinnerTipoJuego);
        ArrayAdapter<CharSequence> adapterTipo = new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayTipo);
        listaTipo.setAdapter(adapterTipo);
        listaTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0){
                    selecciona = arrayTipo.get(position).toString();
                }
                switch (position){
                    case 0:
                        campoTiempo.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        campoTiempo.setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        campoTiempo.setVisibility(View.VISIBLE);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Posicion " + selecciona,Toast.LENGTH_SHORT).show();
    }
}
