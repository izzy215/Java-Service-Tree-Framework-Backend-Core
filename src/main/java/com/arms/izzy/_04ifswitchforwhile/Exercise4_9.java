package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i =0; i < str.length(); i++){
            System.out.println("str.charAt(i) = " + str.charAt(i));
            sum +=(int)str.charAt(i)-'0';
            //문자 '0' 을 빼줘야함.
        }
        System.out.println("sum = " + sum);
    }
}
