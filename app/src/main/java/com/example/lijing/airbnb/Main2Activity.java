package com.example.lijing.airbnb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LottieAnimationView animation3View = (LottieAnimationView) findViewById(R.id.animation3_view);
        animation3View.setAnimation("lottielogo1.json");
        animation3View.loop(true);
        LottieAnimationView animation4View = (LottieAnimationView) findViewById(R.id.animation4_view);
        animation4View.setAnimation("lottielogo2.json");
        animation4View.loop(true);
        LottieAnimationView animation5View = (LottieAnimationView) findViewById(R.id.animation5_view);
        animation5View.setAnimation("motioncorpse.json");
        animation5View.loop(true);
        LottieAnimationView animation6View = (LottieAnimationView) findViewById(R.id.animation6_view);
        animation6View.setAnimation("PinJump.json");
        animation6View.loop(true);
    }
}
