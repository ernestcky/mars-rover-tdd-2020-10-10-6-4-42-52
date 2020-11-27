package com.afs.tdd;

import java.util.Arrays;

public class Rover {
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    private Integer locationX;
    private Integer locationY;
    private String direction;

    public Rover(Integer locationX, Integer locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public Integer getLocationX() {
        return this.locationX;
    }

    public Integer getLocationY() {
        return this.locationY;
    }

    public String getDirection() {
        return this.direction;
    }

    private void moveForward() {
        switch (this.direction) {
            case NORTH:
                this.locationY += 1;
                break;
            case SOUTH:
                this.locationY -= 1;
                break;
            case EAST:
                this.locationX += 1;
                break;
            case WEST:
                this.locationX -= 1;
                break;
        }
    }

    private void turnLeft() {
        switch (this.direction) {
            case NORTH:
                this.direction = WEST;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
            case EAST:
                this.direction = NORTH;
                break;
        }
    }

    private void turnRight() {
        switch (this.direction) {
            case NORTH:
                this.direction = EAST;
                break;
            case SOUTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = NORTH;
                break;
            case EAST:
                this.direction = SOUTH;
                break;
        }
    }

    private void handleInstruction(String instruction) {
        switch (instruction) {
            case MOVE:
                this.moveForward();
                break;
            case LEFT:
                this.turnLeft();
                break;
            case RIGHT:
                this.turnRight();
        }
    }

    public void controlRover(String instruction) {
        Arrays.asList(instruction.split("")).forEach(this::handleInstruction);
    }

}
