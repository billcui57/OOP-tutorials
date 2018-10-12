/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author 348848128
 */
public class becker {
    public static void main (String[] args){
        City Waterloo = new City();
        Robot bob =new Robot(Waterloo, 3, 0, Direction.NORTH,0);
     
      Wall w1 = new Wall(Waterloo, 3, 1, Direction.WEST);
      Wall w2 = new Wall(Waterloo, 3, 1, Direction.NORTH);
      Wall w3 = new Wall(Waterloo, 3, 2, Direction.NORTH);
      Wall w4 = new Wall(Waterloo, 3, 3, Direction.NORTH);
      Wall w5 = new Wall(Waterloo, 3, 3, Direction.EAST);
      Wall w6 = new Wall(Waterloo, 3, 3, Direction.SOUTH);
      Wall w7 = new Wall(Waterloo, 3, 2, Direction.SOUTH);
      Thing t1 = new Thing(Waterloo, 2, 1);
      Thing t2 = new Thing(Waterloo, 2, 3);
      Thing t3 = new Thing(Waterloo, 3, 4);
      
      bob.setColor(Color.blue);
      bob.setLabel("Bob");
      bob.move();
      turnRight(bob);
      moveMulti(bob,1);
      bob.pickThing();
      moveMulti(bob,2);
      bob.pickThing();
      moveMulti(bob,1);
      turnRight(bob);
        moveMulti(bob,1);
        bob.pickThing();
        moveMulti(bob,1);
        turnRight(bob);
        moveMulti(bob,3);
        turnRight(bob);
        moveMulti(bob,1);
        turnRight(bob);
        bob.putThing();
        moveMulti(bob,1);
        bob.putThing();
        moveMulti(bob,1);
        bob.putThing();
    }
    
    
    public static void turnRight(Robot b){
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
    }
    
    public static void moveMulti(Robot b, int n){
        for(int i=0;i<n;i++){
            b.move();
        }
    }
}



