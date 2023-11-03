package com.cubicussol.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void simpleToast(Context C, String test){
        Toast.makeText(C, test, Toast.LENGTH_SHORT).show();

    }
}
