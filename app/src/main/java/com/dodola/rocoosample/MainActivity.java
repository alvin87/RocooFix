/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.dodola.rocoosample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.dodola.rocoofix.RocooFix;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.btnFixMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelloHack hack = new HelloHack();
                Toast.makeText(MainActivity.this, hack.showHello(), Toast.LENGTH_SHORT).show();
            }
        });
        this.findViewById(R.id.btnFixMeRuntime).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelloHack hack = new HelloHack();
                Toast.makeText(MainActivity.this, hack.showHello(), Toast.LENGTH_SHORT).show();
                RocooFix.initPathFromAssetsRuntime(MainActivity.this, "patch.jar");
                HelloHack hack1 = new HelloHack();
                Toast.makeText(MainActivity.this, hack1.showHello(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
