package ru.geekbrains.java.oop.at;

/* Робот для задания 1 */
public class Robot {
    private static String robotname;


    public Robot(String robotname){

        this.robotname = robotname;
    }

    public static String getname(){
        return robotname;
    }


    public void run (){
        System.out.println(Robot.getname() + " runs!");
    }

    public void jump (){
        System.out.println(Robot.getname() + " jumps!");
    }
}
