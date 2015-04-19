package edu.washington.benjamon.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class SpyTivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spy_tivity);
        Log.i("spytag","onCreate Event Fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("spytag", "onPause Event Fired");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("spytag", "onResume Event Fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("spytag", "onRestart Event Fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("spytag", "onStop Event Fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("spytag", "onStart Event Fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("spytag","We're going down captain!");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spy_tivity, menu);
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
}
