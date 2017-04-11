package com.YoungSong.randy;

import java.util.ArrayList;

/**
 * Created by Randy on 4/11/2017.
 */
public class Dealer extends PlayerV2 {

    public Dealer(Double startingMoney, String name) {
        super(startingMoney, name);
    }

    //TODO
    /**
     *
     * @return return true if the AI should hit given their current hand
     */
    boolean shouldHit() {
        return false;
    }

    //TODO
    @Override
    //TODO
    /**
     * Function that prints the player's current visible hand
     * roundOver: true if the round is over and the player is showing their full hand
     */
    void showHand(boolean roundOver) {

    }

}
