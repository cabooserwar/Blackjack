package com.YoungSong.randy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Randy on 4/11/2017.
 */
public class PlayerV2 {

    public List<Card> hand;
    public Double money;
    public String name;

    public PlayerV2(Double startingMoney, String name) {
        this.money = startingMoney;
        this.name = name;
        hand = new ArrayList<>();

    }

    //TODO
    /**
     * Function that determines whether the player has gone over the hand limit (and is no longer eligible for hitting)
     * @return true if hand is over the playable limit
     */
    boolean handOverLimit() {
        return true;
    }

    //TODO
    /**
     * Function that prints the player's current visible hand
     * roundOver: true if the round is over and the player is showing their full hand
     */
    void showHand(boolean roundOver) {

    }

    //TODO
    /**
     *
     */
    void dealCard(Card card) {

    }


}
