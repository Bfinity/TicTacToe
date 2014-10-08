package com.example.bfinerocks.tictactoe;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class GameActivity extends ActionBarActivity implements View.OnClickListener, WelcomeFragment.OnFragmentInteractionListener {
    ImageButton row1col1, row1col2, row1col3;
    ImageButton row2col1, row2col2, row2col3;
    ImageButton row3col1, row3col2, row3col3;
    GameAction mGameAction;
    Player mPlayer1;
    Player mPlayer2;
    boolean mWinnerFound;
    EditText mPlayer1Name;
    EditText mPlayer2Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        row1col1 = (ImageButton) findViewById(R.id.row1col1);
        row1col1.setOnClickListener(this);
        row1col2 = (ImageButton) findViewById(R.id.row1col2);
        row1col2.setOnClickListener(this);
        row1col3 = (ImageButton) findViewById(R.id.row1col3);
        row1col3.setOnClickListener(this);
        row2col1 = (ImageButton) findViewById(R.id.row2col1);
        row2col1.setOnClickListener(this);
        row2col2 = (ImageButton) findViewById(R.id.row2col2);
        row2col2.setOnClickListener(this);
        row2col3 = (ImageButton) findViewById(R.id.row2col3);
        row2col3.setOnClickListener(this);
        row3col1 = (ImageButton) findViewById(R.id.row3col1);
        row3col1.setOnClickListener(this);
        row3col2 = (ImageButton) findViewById(R.id.row3col2);
        row3col2.setOnClickListener(this);
        row3col3 = (ImageButton) findViewById(R.id.row3col3);
        row3col3.setOnClickListener(this);

        mPlayer1 = new Player("Me", "X");
        mPlayer2 = new Player("You", "O");
        mGameAction = new GameAction(mPlayer1, mPlayer2);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity, new WelcomeFragment())
                    .commit();
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.row1col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 0);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row1col1.setImageResource(R.drawable.image001);
                } else {
                    row1col1.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;


            case R.id.row1col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 1);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row1col2.setImageResource(R.drawable.image001);
                } else {
                    row1col2.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row1col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 2);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row1col3.setImageResource(R.drawable.image001);
                } else {
                    row1col3.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row2col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 0);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row2col1.setImageResource(R.drawable.image001);
                } else {
                    row2col1.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row2col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 1);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row2col2.setImageResource(R.drawable.image001);
                } else {
                    row2col2.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row2col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 2);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row2col3.setImageResource(R.drawable.image001);
                } else {
                    row2col3.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row3col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 0);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row3col1.setImageResource(R.drawable.image001);
                } else {
                    row3col1.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row3col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 1);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row3col2.setImageResource(R.drawable.image001);
                } else {
                    row3col2.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

            case R.id.row3col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 2);
                if (mGameAction.getPlayer().getPlayerMarker().equalsIgnoreCase("o")) {
                    row3col3.setImageResource(R.drawable.image001);
                } else {
                    row3col3.setImageResource(R.drawable.image002);
                }
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                winnerFoundGameOver(mWinnerFound);
                mGameAction.setNumOfTurns();
                break;

        }

    }

    public void winnerFoundGameOver(boolean winnerFound) {
        if (winnerFound) {
            row1col1.setEnabled(false);

            row1col2.setEnabled(false);

            row1col3.setEnabled(false);

            row2col1.setEnabled(false);

            row2col2.setEnabled(false);

            row2col3.setEnabled(false);

            row3col1.setEnabled(false);

            row3col2.setEnabled(false);

            row3col3.setEnabled(false);

            Toast.makeText(this, "We Have A Winner", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        welcomeFragment().onDetach();

    }



}





