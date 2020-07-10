package ru.geekbrains.java.oop.at;

public class Participant2 {

    private static String nameforp2;
    static int s3; // максимальная длина бега для второго участника
    static int s4; // максимальная высота прыжка для второго участника


    public Participant2(String nameforp2, int s3, int s4) {
        this.nameforp2 = nameforp2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public static String getName2(){
        return nameforp2;
    }


    public static void trackrunforP2(){
        if (s3 >= Track.lengthmax ) {
            System.out.println(Participant2.getName2() + " ran!" );
        } else System.out.println(Participant2.getName2() + " didn`t run!");

    }

    public static void wallclimbforP2(){
        if (s4 >= Wall.heigthmax ) {
            System.out.println(Participant2.getName2() + " climbed!" );
        } else System.out.println(Participant2.getName2() + " didn`t climb!");

    }



}
