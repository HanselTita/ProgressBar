package com.softhans.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 1. Initialize the item or button that causes the progress bar.
 * 2. Initialize the ProgressDialog from android libraries.
 * 3. set onClick listener to the item or button
 * 4. in the onClick method, set a title and message for your progress bar. Then show
 * NB: Use the code "loadingBar.setCanceledOnTouchOutside(true);"  when you want the user
 * to click on the screen and the loading bar disappears. If you don't want that, change the value to
 * "false"
 */

public class MainActivity extends AppCompatActivity {

    private Button myBtn;

    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn = findViewById(R.id.click_btn);

        loadingBar = new ProgressDialog(this);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                loadingBar.setTitle("Wait for it!");
                loadingBar.setMessage("wait for it...wait for it...");
                loadingBar.setCanceledOnTouchOutside(true);
                loadingBar.show();
            }
        });
    }
}
