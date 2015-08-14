package com.jcuentas.example.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jcuentas.example.BR;

import org.parceler.Parcel;

/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 02:37 PM.
 * E-mail: jcuentast@gmail.com
 */
@Parcel
public class Usuario extends BaseObservable {
    public boolean visible = false;
    public String nombre;

    @Bindable
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
        notifyPropertyChanged(BR.visible);
    }
    @Bindable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        notifyPropertyChanged(BR.nombre);
    }


}