package com.project0.matthewharmon.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    protected Button btnSpotifyStreamer;
    protected Button btnScoresApp;
    protected Button btnLibraryApp;
    protected Button btnBuildItBigger;
    protected Button btnXyzReader;
    protected Button btnCapstone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Build out the layout items.
        this.btnSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        this.btnScoresApp = (Button) findViewById(R.id.btn_scores_app);
        this.btnLibraryApp = (Button) findViewById(R.id.btn_library_app);
        this.btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        this.btnXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        this.btnCapstone = (Button) findViewById(R.id.btn_capstone);

        // Add the on click listeners.
        this.btnSpotifyStreamer.setOnClickListener(this);
        this.btnScoresApp.setOnClickListener(this);
        this.btnLibraryApp.setOnClickListener(this);
        this.btnBuildItBigger.setOnClickListener(this);
        this.btnXyzReader.setOnClickListener(this);
        this.btnCapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    /**
     * Display a toast for the buttons upon click.
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String btnText = button.getText().toString();
        String message = String.format(
            "This button will launch the %s app!",
            btnText
        );
        Context appContext = view.getContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(appContext, message, duration);
        toast.show();
    }
}
