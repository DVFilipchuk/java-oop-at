package ru.geekbrains.java.oop.at;

/* Кот для задания 1 */

public class Cat {
    private static String catname;


    public Cat(String catname){

        this.catname = catname;
    }

    public static String getname(){
        return catname;
    }


    public void run (){
        System.out.println(Cat.getname() + " runs!");
    }

    public void jump (){
        System.out.println(Cat.getname() + " jumps!");
    }


}
