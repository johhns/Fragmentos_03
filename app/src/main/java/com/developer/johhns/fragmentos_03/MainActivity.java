package com.developer.johhns.fragmentos_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    getSupportFragmentManager().beginTransaction()
                               .setReorderingAllowed(true)
                               .add(R.id.fragmento_programatico,FragmentoTres.class,null)
                               .commit();

    }
}