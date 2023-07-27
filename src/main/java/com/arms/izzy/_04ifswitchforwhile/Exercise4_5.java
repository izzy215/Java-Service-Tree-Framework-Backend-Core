package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_5 {
    /*
    * for문을 while문으로.
    * */
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <=i; j++)
                System.out.println("*");
                System.out.println();
        }
        System.out.println("====================");
        int e = 0;
        int f = 0;
        while (e<= 10) {
            f = 0;
            while (f<= e) {
                System.out.println("*");
                f++;
            }
            System.out.println();
            e++;

        }

    }
}
