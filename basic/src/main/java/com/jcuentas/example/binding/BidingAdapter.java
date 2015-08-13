package com.jcuentas.example.binding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Created by Jose Cuentas Turpo on 13/08/2015 - 02:37 PM.
 * E-mail: jcuentast@gmail.com
 */
public class BidingAdapter {

    @BindingAdapter({"app:binding"})
    public static void setFadeVisible(final View view, boolean visible) {
        view.animate().cancel();

        if (visible) {
            view.setVisibility(View.VISIBLE);
            view.setAlpha(0);
            view.animate().alpha(1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    view.setAlpha(1);
                }
            });
        } else {
            view.animate().alpha(0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    view.setAlpha(1);
                    view.setVisibility(View.GONE);
                }
            });
        }
    }
}
