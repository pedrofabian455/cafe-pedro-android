package com.pedro.cafepedro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {

    View view;
    Button botoncol1;
    Button botoncol2;
    Button botoncol3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_coleccion, container, false);
//        Boton Uno
        botoncol1 = (Button) view.findViewById(R.id.btnEventoAgendar);
        botoncol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscripcion a gran Espresso", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Dos
        botoncol2 = (Button) view.findViewById(R.id.btnEventoAgendar2);
        botoncol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscripcion a planalto", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Tres
        botoncol3 = (Button) view.findViewById(R.id.btnEventoAgendar3);
        botoncol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscripcion a planalto", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
