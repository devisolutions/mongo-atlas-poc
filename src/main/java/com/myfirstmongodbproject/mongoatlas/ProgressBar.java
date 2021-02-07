package com.myfirstmongodbproject.mongoatlas;

public class ProgressBar {

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws java.lang.Exception {

        for (int i = 0; i <= 100; i++) {
            sb.setLength(0);
            for (int j = 0; j < i; j++) {
                sb.append("█");
            }
            Thread.sleep(100);
            System.out.print("[" + String.format("%-100s", sb.toString()) + "] " + i + "%");
            System.out.print("\r");
        }
    }
}
