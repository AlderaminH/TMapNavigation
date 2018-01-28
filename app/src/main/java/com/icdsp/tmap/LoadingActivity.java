package com.icdsp.tmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ICDSP on 2018-01-25.
 */

public class LoadingActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
