package com.pirate.demoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends Activity {

  private ImageView image;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    image = (ImageView) findViewById(R.id.image);

    image.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Animation anim = new MyAnimation(image, 100, 180);
        anim.setDuration(3000);
        image.startAnimation(anim);
      }
    });
  }

}

