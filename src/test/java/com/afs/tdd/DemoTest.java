package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_1_when_controlRover_given_0_0_N_and_M() {
        // given
        Rover rover = new Rover(0, 0, "N");

        // when execute
        rover.controlRover("M");

        // then
        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getDirection());
    }
    
    @Test
    public void should__return_y_minus_1_when_controlRover_given_0_0_S_and_M() {
        // given
        Rover rover = new Rover(0, 0, "S");

        // when execute
        rover.controlRover("M");

        // then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getDirection());
    }
    
}
