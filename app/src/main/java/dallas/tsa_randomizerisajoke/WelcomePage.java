package dallas.tsa_randomizerisajoke;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/* Welcome page for the TSA Randomizing arrow app */


public class WelcomePage extends AppCompatActivity {

    private static final String TAG = WelcomePage.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        Log.d(TAG, "Welcome page is loaded");

        final Button advanceBtn = (Button) findViewById(R.id.intializeActivity);

        advanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent("dallas.tsa_randomizerisajoke.MainActivity");
                startActivity(mainIntent);
            }
        });

    }
}
