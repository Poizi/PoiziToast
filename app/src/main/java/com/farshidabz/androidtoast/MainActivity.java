package com.farshidabz.androidtoast;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.farshidabz.poizitoast.PoiziToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = new Button(this);
    }

    public void normal(View view) {
        PoiziToast.with(this)
                .normal("Normal Toast", Toast.LENGTH_SHORT)
                .show();
    }

    public void info(View view) {
        PoiziToast.with(this)
                .info("info Toast", Toast.LENGTH_SHORT)
                .show();
    }

    public void error(View view) {
        PoiziToast.with(this)
                .error("error Toast", Toast.LENGTH_SHORT)
                .show();
    }

    public void warning(View view) {
        PoiziToast.with(this)
                .warning("warning Toast", Toast.LENGTH_SHORT)
                .show();
    }

    public void success(View view) {
        PoiziToast.with(this)
                .success("success", Toast.LENGTH_SHORT)
                .show();
    }

    public void custom(View view) {
        PoiziToast.with(this)
                .setBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setIcon(R.drawable.battery_charging_full)
                .setGravity(Gravity.BOTTOM)
                .setTextColor(R.color.textColor)
                .setTextSize(14)
                .setTextTypeFace(Typeface.createFromAsset(getAssets(), "fonts/irsans.ttf"))
                .makeToast("custom text", Toast.LENGTH_SHORT)
                .show();
    }
}
