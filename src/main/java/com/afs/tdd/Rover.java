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

    private void moveForward() {
        switch(this.direction) {
            case "N":
                this.locationY += 1;
                break;
            case "S":
                this.locationY -= 1;
                break;
            case "E":
                this.locationX += 1;
                break;
            case "W":
                this.locationX -= 1;
                break;
        }
    }

    private void turnLeft() {
        switch (this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;

        }
    }

    private void handleInstruction(String instruction) {
        switch (instruction) {
            case "M":
                this.moveForward();
                break;

            case "L":
                this.turnLeft();
                break;
        }
    }

    public void controlRover(String instruction) {
        Arrays.asList(instruction.split("")).forEach(this::handleInstruction);
    }

}
