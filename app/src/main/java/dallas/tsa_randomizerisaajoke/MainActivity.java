package dallas.tsa_randomizerisaajoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftArrow = (ImageView) findViewById(R.id.leftArrow);
        final ImageView rightArrow = (ImageView) findViewById(R.id.rightArrow);
        final Button btn = (Button) findViewById(R.id.randomizeButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftArrow.setVisibility(View.GONE);
                rightArrow.setVisibility(View.GONE);
                btn.setVisibility(View.INVISIBLE);

                int arrowNumber = getArrow();
                Log.d(TAG, arrowNumber+"");
                if (arrowNumber == 1) leftArrow.setVisibility(View.VISIBLE);
                else rightArrow.setVisibility(View.VISIBLE);
            }
        });




    }

    public static int getArrow(){
        Random random = new Random();
        int arrowNumber = random.nextInt(2);
        return arrowNumber;
    };


}
