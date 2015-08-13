package com.jcuentas.example.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.jcuentas.example.R;
import com.jcuentas.example.data.model.Persona;
import com.jcuentas.example.data.model.Usuario;
import com.jcuentas.example.databinding.ActivityMenuBinding;

public class MainActivity extends AppCompatActivity {
    Persona mPersona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMenuBinding activityMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu);


        mPersona = new Persona();
        mPersona.status.set(true);
        mPersona.text.set("asdasd");

        activityMenuBinding.setPersona(mPersona);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            mPersona.visible();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
