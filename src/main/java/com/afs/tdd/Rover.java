package com.afs.tdd;

import java.util.Arrays;

public class Rover {
    private Integer locationX;
    private Integer locationY;
    private String direction;

    public Rover(Integer locationX, Integer locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public Integer getLocationX() {
        return locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void controlRover(String instruction) {
        this.locationY = this.locationY + 1;
    }

}
