package org.example;

public class Util {
    static void delay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
