package net.androidbootcamp.northernlightanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable lightAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame = (ImageView) findViewById(R.id.imgLights);

        imgFrame.setBackgroundResource(R.drawable.animation);
        lightAnimation = (AnimationDrawable) imgFrame.getBackground();
        Button button1 = (Button) findViewById(R.id.btnStart);
        Button button2 = (Button) findViewById(R.id.btnStop);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightAnimation.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightAnimation.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));

            }
        });
    }
}
