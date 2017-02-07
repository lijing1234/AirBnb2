package com.example.lijing.airbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView onclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclick= (TextView) findViewById(R.id.onclick);
        LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.animation_view);
        animationView.setAnimation("check.json");
        animationView.loop(true);
        LottieAnimationView animation1View = (LottieAnimationView) findViewById(R.id.animation1_view);
        animation1View.setAnimation("logosmall.json");
        animation1View.loop(true);
        LottieAnimationView animation2View = (LottieAnimationView) findViewById(R.id.animation2_view);
        animation2View.setAnimation("work.json");
        animation2View.loop(true);
        onclick.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.onclick:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;

        }
    }
}
