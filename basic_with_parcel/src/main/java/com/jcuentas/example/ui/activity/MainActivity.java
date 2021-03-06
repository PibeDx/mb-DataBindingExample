package com.jcuentas.example.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.jcuentas.example.R;
import com.jcuentas.example.data.model.Usuario;
import com.jcuentas.example.databinding.ActivityMenuBinding;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_USUARIO = "usuario";
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMenuBinding activityMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu);
        //Solucion cuando se cambia de orientacion del dispositivo, la informacion permanece
        if (savedInstanceState==null){
            usuario = new Usuario();
        }else{
            usuario = Parcels.unwrap(savedInstanceState.getParcelable(KEY_USUARIO));
        }
        activityMenuBinding.setUser(usuario);
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_USUARIO, Parcels.wrap(usuario));
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
            usuario.setVisible(!usuario.isVisible());
//            usuario.setNombre("José");
            Log.d("MainActivity", ""+usuario.nombre);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
