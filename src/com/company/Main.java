package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221) );
    }
    public static boolean isPalindrome(int num) {
        if(num / 10 == 0){
            System.out.println("must be more than one number");
            return false;
        }
        int reverse = 0;
        int forwardNum = num;
        while(num > 0){
            int lastDig = num % 10;
            reverse *= 10;
            reverse += lastDig;
            num /= 10;
        }
        return reverse == forwardNum;

    }
}
