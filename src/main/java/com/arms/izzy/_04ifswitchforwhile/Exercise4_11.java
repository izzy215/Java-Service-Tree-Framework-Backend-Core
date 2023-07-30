package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_11 {
    public static void main(String[] args) {
        //Fibonnaci수열 첫 시작은 1, 1
        int num1 =1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            System.out.print( "," + num3 );
            num1 = num2;
            num2 =num3 ;

        }
    }
}
