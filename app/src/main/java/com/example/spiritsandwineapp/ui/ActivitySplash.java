package com.example.spiritsandwineapp.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spiritsandwineapp.R;

public class ActivitySplash extends AppCompatActivity {
    ImageView likes;
    TextView text1;
    TextView text2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        likes = findViewById(R.id.sunny);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        },1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startExitAnimation();
            }
        },3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(com.example.spiritsandwineapp.ui.ActivitySplash.this,LoginActivity.class));
                finish();
            }
        },5000);
    }
    private void startEnterAnimation() {
        likes.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_in));
        text1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_in));
        text2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_in));
        likes.setVisibility(View.VISIBLE);
        text1.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
    }
    private void startExitAnimation() {
        likes.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_out));
        text1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_out));
        text2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_out));
        likes.setVisibility(View.INVISIBLE);
        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
    }
}