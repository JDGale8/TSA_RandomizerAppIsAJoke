package dallas.tsa_randomizerisajoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MAIN ACTIVITY LOADED");

        final ImageView leftArrow = (ImageView) findViewById(R.id.leftArrow);
        final ImageView rightArrow = (ImageView) findViewById(R.id.rightArrow);
        final Button btn = (Button) findViewById(R.id.randomizeButton);

        final Animation arrowFadeOut = new AlphaAnimation(1,0);  // parameters are 'from alpha', 'to alpha'
        arrowFadeOut.setStartOffset(500); // When the animation should start relative to start time
        arrowFadeOut.setDuration(500);
        leftArrow.setAnimation(arrowFadeOut);
        rightArrow.setAnimation(arrowFadeOut);

        arrowFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                leftArrow.setVisibility(View.GONE);
                rightArrow.setVisibility(View.GONE);
                btn.setVisibility(View.VISIBLE);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftArrow.setVisibility(View.GONE);
                rightArrow.setVisibility(View.GONE);
                btn.setVisibility(View.GONE);

                int arrowNumber = getArrow();
                Log.d(TAG, "Arrow number is " + arrowNumber);
                if (arrowNumber == 1) {
                    leftArrow.setVisibility(View.VISIBLE);
                    leftArrow.startAnimation(arrowFadeOut);
                }
                else {
                    rightArrow.setVisibility(View.VISIBLE);
                    rightArrow.startAnimation(arrowFadeOut);
                }
            }
        });




    }

    public static int getArrow(){
        Random random = new Random();
        int arrowNumber = random.nextInt(2);
        return arrowNumber;
    };


}
