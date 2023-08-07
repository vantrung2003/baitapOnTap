package com.example.demoontap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.demoontap.home.Login;

public class MainActivity extends AppCompatActivity {
    private TextView tvName, tvMSV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LottieAnimationView animationView = findViewById(R.id.lottiename);
        tvName = findViewById(R.id.tvName);
        tvMSV = findViewById(R.id.tvMSV);

        // Animate Lottie from the left to center
        animationView.setTranslationX(-1000);
        animationView.animate()
                .translationX(0)
                .setDuration(2000)
                .setStartDelay(0);

        // Animate TextViews from the bottom to the top of Lottie
        tvName.setTranslationY(2000);
        tvName.animate()
                .translationY(-1400)
                .setDuration(2000)
                .setStartDelay(0);

        tvMSV.setTranslationY(2000);
        tvMSV.animate()
                .translationY(-1400)
                .setDuration(2000)
                .setStartDelay(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}
