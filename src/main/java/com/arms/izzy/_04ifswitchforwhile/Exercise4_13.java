package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;
        for (int i = 0; i < value.length(); i++) {
            ch = value.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {//ch '0'  0 둘다 숫자로봄...?
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value + "is Number. 는 숫자입니다.");
        }else{
            System.out.println(value + "is Not a Number.는 숫자가 아닙니다.");
        }
    }
}
