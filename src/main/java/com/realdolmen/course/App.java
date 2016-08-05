package com.realdolmen.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        final Logger logger  = LoggerFactory.getLogger(App.class);

        logger.info("Example action excecuted");

        try {
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.println("Hello" + "this" + "is" + i);
            }
        } catch (Exception e) {
            System.out.println("Hello");
        }

        logger.warn("Be cautious!");
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
