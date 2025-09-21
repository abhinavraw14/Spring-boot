package com.telusko;

public class Alien {
    private int age;
    private int salary;
    private Laptop lap;
    public Alien(){
        System.out.println("Object Created");
    }

    public Alien(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
//        this.salary = salary;
    }

    //    public Alien(int age, ){
//        System.out.println("parameterised construct called");
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }
}
