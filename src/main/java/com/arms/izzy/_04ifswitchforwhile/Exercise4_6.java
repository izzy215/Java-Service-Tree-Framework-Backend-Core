package com.arms.izzy._04ifswitchforwhile;

public class Exercise4_6 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        for (dice1 = 1; dice1 <= 6; dice1++) {
            for (dice2 = 1; dice2 <= 6; dice2++) {
                if(dice1 + dice2 ==6){
                    System.out.print("dice1 : "+dice1);
                    System.out.println(", dice2 : "+dice2);

                }
            }
        }
    }
}
