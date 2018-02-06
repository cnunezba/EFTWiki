package develop.software.cbay.eftwiki.weapon;


import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import develop.software.cbay.eftwiki.R;

/**
 * Created by cnune on 01/02/2018.
 */

public class WeaponFragmentDetail extends Fragment {

    private String nombre;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        nombre = args.getString("nombre");

        return inflater.inflate(R.layout.fragment_weapon_detail, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Weapon Detail");

        TextView tNombre = view.findViewById(R.id.txtFragmentWeaponDetail);
        tNombre.setText(nombre);
    }
}
