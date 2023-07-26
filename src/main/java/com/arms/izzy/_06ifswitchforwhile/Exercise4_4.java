package com.arms.izzy._06ifswitchforwhile;

public class Exercise4_4 {
    public static void main(String[] args) {
        /*
        * 1+(-2)+3+(-4)+ 5 +(-6) + 7
        * 1  -1  2   -2  3   -3    4
        * 홀수에 1씩 증가.. 100번째 홀수?
        *
        *
        * */
       int sum= 0;
       int i =0;
        while (true) {          //조건확인까지
            i++;                //아니면  1추가후 진행
            if (i % 2 == 0)     //짝수이면
                sum-=i;         //빼기
            else
               sum+=i;           //더하기

            if(sum >=100)break;    //백 넘으면 스톱

        }
        System.out.println("sum = " + sum);
        System.out.println("i = " + i);
    }
}
