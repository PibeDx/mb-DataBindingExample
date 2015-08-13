package com.jcuentas.example.binding;

import android.databinding.BaseObservable;


/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 03:41 PM.
 * E-mail: jcuentast@gmail.com
 */
public class BindingString  extends BaseObservable{
    String value;

    public String get() {
        return value != null ? value : "";
    }

    public void set(String value) {
        if (!Objects.equals(this.value, value)) {
            this.value = value;
            notifyChange();
        }
    }
}
