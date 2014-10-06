package com.example.bfinerocks.tictactoe;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class GameActivity extends ActionBarActivity implements View.OnClickListener{
    TextView row1col1, row1col2, row1col3;
    TextView row2col1, row2col2, row2col3;
    TextView row3col1, row3col2, row3col3;
    int numOfMoves = 0;
    GameAction mGameAction;
    Player mPlayer1;
    Player mPlayer2;
    boolean mWinnerFound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        row1col1 = (TextView) findViewById(R.id.row1col1);
        row1col1.setOnClickListener(this);
        row1col2 = (TextView) findViewById(R.id.row1col2);
        row1col2.setOnClickListener(this);
        row1col3 = (TextView) findViewById(R.id.row1col3);
        row1col3.setOnClickListener(this);
        row2col1 = (TextView) findViewById(R.id.row2col1);
        row2col1.setOnClickListener(this);
        row2col2 = (TextView) findViewById(R.id.row2col2);
        row2col2.setOnClickListener(this);
        row2col3 = (TextView) findViewById(R.id.row2col3);
        row2col3.setOnClickListener(this);
        row3col1 = (TextView) findViewById(R.id.row3col1);
        row3col1.setOnClickListener(this);
        row3col2 = (TextView) findViewById(R.id.row3col2);
        row3col2.setOnClickListener(this);
        row3col3 = (TextView) findViewById(R.id.row3col3);
        row3col3.setOnClickListener(this);

        mPlayer1 = new Player("Me", "X");
        mPlayer2 = new Player("You", "O");
        mGameAction = new GameAction(mPlayer1, mPlayer2);
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

        switch (view.getId())
        {
            case R.id.row1col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 0);
                row1col1.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;


            case R.id.row1col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 1);
                row1col2.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row1col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 0, 2);
                row1col3.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row2col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 0);
                row2col1.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row2col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 1);
                row2col2.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row2col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 1, 2);
                row2col3.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row3col1:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 0);
                row3col1.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row3col2:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 1);
                row3col2.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

            case R.id.row3col3:
                mGameAction.getTicTacToe().placeMarker(mGameAction.getPlayer(), 2, 2);
                row3col3.setText(mGameAction.getPlayer().getPlayerMarker());
                mWinnerFound = mGameAction.getTicTacToe().foundWinner();
                break;

        }

    }
}
