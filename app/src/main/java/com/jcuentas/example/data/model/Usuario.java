package com.jcuentas.example.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 02:37 PM.
 * E-mail: jcuentast@gmail.com
 */
public class Usuario extends BaseObservable {
    boolean visible = false;



    @Bindable
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
        notifyPropertyChanged(com.jcuentas.example.BR.visible);

    }
}
