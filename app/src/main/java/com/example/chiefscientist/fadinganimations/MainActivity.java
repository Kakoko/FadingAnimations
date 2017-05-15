package com.example.chiefscientist.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView ghost = (ImageView)findViewById(R.id.IVGhost);
        ImageView cent = (ImageView)findViewById(R.id.IVCent);
        ghost.animate().alpha(0f).setDuration(2000);


        cent.animate().alpha(1f).setDuration(2000);
    }

    public void fadeCent(View view){
        ImageView ghost = (ImageView)findViewById(R.id.IVGhost);
        ImageView cent = (ImageView)findViewById(R.id.IVCent);
        ghost.animate().alpha(0f).setDuration(2000);


        cent.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
