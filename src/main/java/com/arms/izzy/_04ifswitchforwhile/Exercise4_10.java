package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        int 일 = num%10;
        int 십 = (num/10)%10;
        int 백 = (num/100)%10;
        int 천 = (num/1000)%10;
        int 만 = (num/10000)%10;
        System.out.println("일 = " + 일);
        System.out.println("십 = " + 십);
        System.out.println("백 = " + 백);
        System.out.println("천 = " + 천);
        System.out.println("만 = " + 만);
        sum = 일+십+백+천+만;

        //줄이기!
        System.out.println("sum = " + sum);
    }
}