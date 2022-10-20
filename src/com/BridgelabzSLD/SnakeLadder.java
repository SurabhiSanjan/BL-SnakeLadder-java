package com.BridgelabzSLD;
import java.util.*;
public class SnakeLadder {
    public static void main(String args[]){
        System.out.println("This is a Single player Snake & Ladder Game");
        int pos = 0;
        System.out.println("Initial Position is " + pos);
        Random r=new Random();
        while(pos!=100){
        int dieRoll=r.nextInt((5) +1)+1;
        System.out.println("You Got :" + dieRoll);
        int sld = r.nextInt(3);
        if(sld==0){
            pos = pos + dieRoll;
            System.out.println("You Got Ladder: New Position is " + pos);

            if(pos>100){
                pos=pos-dieRoll;
                System.out.println("Position Exceed 100, Holding to  " + pos);
            }
        }
        if(sld==1){
            pos=pos - dieRoll;
            System.out.println("You Got Snake: New Position is " + pos);

            if(pos<0){
                pos=0;
                System.out.println("Player Restarts at " + pos);
            }
        }
        if(sld==2){
            System.out.println("You Got No Play: Position is " + pos);
        }}
    }
}
