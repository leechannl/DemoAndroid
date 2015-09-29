/**
 * Created by mm on 9/29/15.
 *
 * Purpose:
 */

package com.pirate.demoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class CirclePathAnimationActivity extends AppCompatActivity {

  private ImageView image;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_circle_path_animation);
    image = (ImageView) findViewById(R.id.animationImageView);

    image.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Animation anim = new MyAnimation(image, 100, 180);
        anim.setDuration(3000);
        image.startAnimation(anim);
      }
    });
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_battery_usage, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
