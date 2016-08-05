package com.realdolmen.course;

/**
 * Hello world!
 */
public class App {
    private int i;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*Runnable r = () -> {
            System.out.println("Hello World");
        };*/

        try {
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.println("Hello" + "this" + "is" + i);
            }
        } catch (Exception e) {
            System.out.println("Hello");
        }
    }

    public App(int a){
        this.i = calc(a);
    }

    private int calc(int a){
        return a*5;
    }

    public int getI() {
        return this.i;
    }
}
