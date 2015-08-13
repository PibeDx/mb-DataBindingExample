package com.jcuentas.example.binding;

import android.databinding.BaseObservable;

/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 03:51 PM.
 * E-mail: jcuentast@gmail.com
 */
public class BindingBoolean extends BaseObservable {
    boolean value;
    public boolean get() {
        return value;
    }

    public void set(boolean value) {
        if (this.value != value){
            this.value = value;
            notifyChange();
        }
    }
}
