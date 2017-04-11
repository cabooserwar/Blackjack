package com.YoungSong.randy;

import com.YoungSong.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Randy on 4/11/2017.
 */
public class Table {

    List<PlayerV2> players;
    Dealer dealer;

    Deck deck;

    public Table() {
        players = new ArrayList<>();
        dealer = new Dealer(1000.0, "Young");

        deck = new Deck();

    }

    //TODO
    void addPlayer(PlayerV2 player) {

    }

    //TODO reomve last player and print their name
    String removePlayer() {
        return "";
    }

    //TODO remove a player, return true if they were successfully removed
    boolean removePlayer(String name) {
        return false;
    }

    //TODO play a round of the game
    void playRound() {

    }

    //TODO return whatever the player's action is, when it is their turn
    String playerTurn() {
        return "";
    }

    //TODO
    void dealCards() {

    }

    //TODO execute whatever player actions are necessary for the player in their turn
    void playerAction(Player currentPlayer) {

    }

    //TODO
    void printResults() {

    }




}
