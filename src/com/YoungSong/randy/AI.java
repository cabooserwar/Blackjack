package com.YoungSong.randy;

/**
 * Created by Randy on 4/11/2017.
 */
public class AI extends PlayerV2 {

    public enum Action {
        HIT,
        STAY,
        SPLIT
    }

    public AI(Double startingMoney, String name) {
        super(startingMoney, name);
    }

    //TODO
    Action determineAction() {
        if(shouldSplit()) {
            return Action.SPLIT;
        }
        if(shouldHit()) {
            return Action.HIT;
        }
        return Action.STAY;
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
    /**
     *
     * @return return true if the AI should hit given their current hand
     */
    boolean shouldStay() {
        return false;
    }


    //TODO
    /**
     *
     * @return return true if the AI should hit given their current hand
     */
    boolean shouldSplit() {
        return false;
    }



}
