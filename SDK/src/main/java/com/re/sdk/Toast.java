package com.re.sdk;

import android.content.Context;

public class Toast {

    static Toast toast;

  public static Toast getInstance() {
        if (toast == null) {
            toast = new Toast();
        }
        return toast;
    }

    public void ShowToast(Context context) {
        android.widget.Toast.makeText(context, "Hello world!", android.widget.Toast.LENGTH_LONG).show();
    }
}
