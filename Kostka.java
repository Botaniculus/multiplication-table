package com.botaniculus.multiplication;
import  java.util.Random;

public class Kostka {
    private Random random;
    private int maxCislo;

    public Kostka(int maxCislo){
        this.maxCislo=maxCislo;
        random=new Random();
    }

    public Kostka(){
        maxCislo=10;
        random=new Random();
    }

    public int navratMaxCisla(){
        return maxCislo;
    }

    public int hod(){
        return random.nextInt(maxCislo)+1;
    }

    @Override
    public String toString(){
        return String.format("Kostka s %s stěnami", maxCislo);
    }

}
