package ru.geekbrains.java.oop.at;

/* Человек для задания 1 */

public class Human {
    private static String name;


    public Human(String name){

        this.name = name;
    }

    public static String getname(){
        return name;
    }


    public void run (){
        System.out.println(Human.getname() + " runs!");
    }

    public void jump (){
        System.out.println(Human.getname() + " jumps!");
    }

}

