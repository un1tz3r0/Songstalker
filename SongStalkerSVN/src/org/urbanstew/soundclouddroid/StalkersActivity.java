package org.urbanstew.soundclouddroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StalkersActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Stalkers tab");
        setContentView(textview);
    }
}
