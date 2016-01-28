package com.example.sshan.mastermind5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);



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

   /* public void select(View v) {
        switch (v.getId()) {
            case R.id.redPeg:
                ImageView riv=(ImageView) findViewById(R.id.testPeg_red);
                riv.setVisibility(View.VISIBLE);
                break;
            case R.id.bluePeg:
                ImageView biv=(ImageView) findViewById(R.id.testPeg_blue);
                biv.setVisibility(View.VISIBLE);
                break;
            case R.id.yellowPeg:
                ImageView yiv=(ImageView) findViewById(R.id.testPeg_yellow);
                yiv.setVisibility(View.VISIBLE);
                break;
            case R.id.greenPeg:
                ImageView giv=(ImageView) findViewById(R.id.testPeg_green);
                giv.setVisibility(View.VISIBLE);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
    }*/

    public void select(View v)
    {

        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.red_peg2);
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.gameRow3);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //lp.addRule(RelativeLayout.BELOW, R.id.gameRow1);
        lp.addRule(RelativeLayout.ALIGN_END);
        //lp.addRule(RelativeLayout.ALIGN_LEFT);
        rl.addView(iv, lp);

    }
}
