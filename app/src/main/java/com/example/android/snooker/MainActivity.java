package com.example.android.snooker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.snooker.R;

public class MainActivity extends AppCompatActivity {

   private int resultPlayerX = 0;
    private  int resultPlayerY = 0;
    private static final String Player_x = "Playerx" ;
    private static final String Player_y = "Playery";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
    * store the values before changing the orientation
    */
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save our own state now
        outState.putInt(Player_x,resultPlayerX);
        outState.putInt(Player_y,resultPlayerY);
    }
        /**
        *  repopulate the saved values from the bundle
        */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resultPlayerX = savedInstanceState.getInt(Player_x);
        resultPlayerY = savedInstanceState.getInt(Player_y);
        display_for_playerx(resultPlayerX);
        display_for_playery(resultPlayerY);
    }
    /**
     *  update the result with the corresponding balls for the player x
     */
    public void onePointx(View view) {
        display_for_playerx(resultPlayerX = resultPlayerX + 1);
    }
    public void twoPointsx(View view) { display_for_playerx(resultPlayerX = resultPlayerX + 2); }
    public void threePointsx(View view) { display_for_playerx(resultPlayerX = resultPlayerX + 3);}
    public void fourPointsx(View view) {
        display_for_playerx(resultPlayerX = resultPlayerX + 4);
    }
    public void fivePointsx(View view) {
        display_for_playerx(resultPlayerX = resultPlayerX + 5);
    }
    public void sixPointsx(View view) {
        display_for_playerx(resultPlayerX = resultPlayerX + 6);
    }
    public void sevenPointsx(View view) {
        display_for_playerx(resultPlayerX = resultPlayerX + 7);
    }
    /*
    * updating value of the result and set the new value in the text field for player x
    **/
    public void display_for_playerx(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.playerX);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * update the result with the corresponding balls for the player y
     */
    public void onePointy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 1);
    }
    public void twoPointsy(View view) { display_for_playery(resultPlayerY = resultPlayerY + 2); }
    public void threePointsy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 3);
    }
    public void fourPointsy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 4);
    }
    public void fivePointsy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 5);
    }
    public void sixPointsy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 6);
    }
    public void sevenPointsy(View view) {
        display_for_playery(resultPlayerY = resultPlayerY + 7);
    }
     /*
    * updating value of the result and set the new value in the text field for player y
    **/
    public void display_for_playery(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.playerY);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * set the results to zero when press on reset button
     */
    public void Reset(View view) {
        display_for_playerx(resultPlayerX = 0);
        display_for_playery(resultPlayerY = 0);
    }
}