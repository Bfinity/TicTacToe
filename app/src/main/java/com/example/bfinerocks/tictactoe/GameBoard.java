package com.example.bfinerocks.tictactoe;

/**
 * Created by BFineRocks on 10/5/14.
 */
public class GameBoard {
    String[][] gameBoard;
    int numRows;
    int numCol;

    public GameBoard()
    {
        gameBoard = new String[][] {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };
        numCol = 3;
        numRows = 3;
    }


    public void placeMarker(Player player, int row, int col)
    {
        String markerToPlace = player.getPlayerMarker();
        gameBoard[row][col] = markerToPlace;
    }

    public boolean foundWinner()
    {
        boolean winnerFound = false;
        if (gameBoard[0][0].equals(gameBoard[1][0]) && gameBoard[1][0].equals(gameBoard[2][0]))
        {
            winnerFound = true;
        }
        else if (gameBoard[0][1].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][1]))
        {
            winnerFound = true;
        }
        else if (gameBoard[0][2].equals(gameBoard[1][2]) && gameBoard[1][2].equals(gameBoard[2][2]))
        {
            winnerFound = true;
        }
        else if (gameBoard[0][0].equals(gameBoard[0][1]) && gameBoard[0][1].equals(gameBoard[0][2]))
        {
            winnerFound = true;
        }
        else if (gameBoard[1][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[1][2]))
        {
            winnerFound = true;
        }
        else if (gameBoard[2][0].equals(gameBoard[2][1]) && gameBoard[2][1].equals(gameBoard[2][2]))
        {
            winnerFound = true;
        }
        else if (gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
        {
            winnerFound = true;
        }
        else if (gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]))
        {
            winnerFound = true;
        }
        return winnerFound;
    }
}
