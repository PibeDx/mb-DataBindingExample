package com.jcuentas.example.data.model;

import android.util.Log;

import com.jcuentas.example.binding.BindingBoolean;
import com.jcuentas.example.binding.BindingString;

/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 03:54 PM.
 * E-mail: jcuentast@gmail.com
 */
public class Persona {
    //BindingString mBindingString = new BindingString();
    public BindingBoolean status = new BindingBoolean();
    public BindingString text = new BindingString();

    public Persona() {
        text.set("asdasd");
        Log.d("TAG", "text:"+text.get());
    }

    //
    public void visible(){

        status.set(!status.get());
        Log.d("TAG", "visible: " + status.get());
    }
}
