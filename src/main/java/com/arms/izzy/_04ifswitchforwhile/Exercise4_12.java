package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_12 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf(i + " *" +  j +"="+ (i*j) +"  ");
            }
            System.out.println();
        }
    }
}
