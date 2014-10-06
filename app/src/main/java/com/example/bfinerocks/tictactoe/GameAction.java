package com.example.bfinerocks.tictactoe;

/**
 * Created by BFineRocks on 10/6/14.
 */
public class GameAction {
    private GameBoard ticTacToe;
    private Player[] playersInGame;


    public GameAction(Player player1, Player player2)
    {
        playersInGame = new Player[]{player1, player2};
        ticTacToe = new GameBoard();
    }

    public GameBoard getTicTacToe()
    {
        return ticTacToe;
    }

    public Player getPlayer()
    {
        int numOfTurns = 0;
        Player playerUp = playersInGame[numOfTurns % 2];
        numOfTurns++;
        return playerUp;
    }






}
