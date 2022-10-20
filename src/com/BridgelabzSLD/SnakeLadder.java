package com.BridgelabzSLD;
import java.util.*;
public class SnakeLadder {
    public static void main(String args[]){
        System.out.println("This is a Single player Snake & Ladder Game");
        int pos;
        Random r=new Random();
        int dieRoll=r.nextInt((5) +1)+1;
        System.out.println("You Got :" + dieRoll);
    }
}
