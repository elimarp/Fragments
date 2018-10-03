package br.com.senaijandira.exemplosfragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import br.com.senaijandira.exemplosfragment.R;

public class Fragment1 extends Fragment{

    //NO FRAGMENT VOCÊ PODE USAR O COMANDO getContext() PARA OBTER O CONTEXTO

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_layout1, container, false);

        Toast.makeText(getContext(), "Texto", Toast.LENGTH_SHORT);

        return v;
    }
}
