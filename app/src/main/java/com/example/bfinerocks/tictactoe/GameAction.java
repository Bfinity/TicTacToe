package com.example.bfinerocks.tictactoe;

/**
 * Created by BFineRocks on 10/6/14.
 */
public class GameAction {
    private GameBoard ticTacToe;
    private Player[] playersInGame;
    int numOfTurns;


    public GameAction(Player player1, Player player2)
    {
        playersInGame = new Player[]{player1, player2};
        ticTacToe = new GameBoard();
        numOfTurns = 0;

    }

    public GameBoard getTicTacToe()
    {
        return ticTacToe;
    }

    public Player getPlayer()
    {
        Player playerUp = playersInGame[numOfTurns % 2];
        return playerUp;
    }

    public void setNumOfTurns()
    {
        numOfTurns++;
    }






}
