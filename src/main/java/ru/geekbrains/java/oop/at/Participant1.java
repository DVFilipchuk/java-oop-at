package ru.geekbrains.java.oop.at;

public class Participant1 {

     private static String nameforp1;
     static int s1; // максимальная длина бега для первого участника
     static int s2; // максимальная высота прыжка для первого участника


    public Participant1(String nameforp1, int s1, int s2){
        this.nameforp1 = nameforp1;
        this.s1 = s1;
        this.s2 = s2;
    }

    public static String getName1(){
        return nameforp1;
    }


    public static void trackrunforP1(){
        if (s1 >= Track.lengthmax ) {
            System.out.println(Participant1.getName1() + " ran!" );
        } else System.out.println(Participant1.getName1() + " didn`t run!");

    }

    public static void wallclimbforP1(){
        if (s2 >= Wall.heigthmax ) {
            System.out.println(Participant1.getName1() + " climbed!" );
        } else System.out.println(Participant1.getName1() + " didn`t climb!");

    }

}
