package com.example.bfinerocks.tictactoe;

/**
 * Created by BFineRocks on 10/5/14.
 */
public class Player {
    String playerName;
    String playerMarker;
    boolean winner;

    public Player(String playerName, String playerMarker)
    {
        this.playerName = playerName;
        this.playerMarker = playerMarker;
        winner = false;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public String getPlayerMarker()
    {
        return playerMarker;
    }

    public void setWinner()
    {
        winner = true;
    }

    public boolean isWinner()
    {
        return winner;
    }
}
