package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int f = x;
        int count = 0;
        while(f >= 1){
            f /= 10;
            count++;
        }
        int[] number = new int[count];
        int g = 0, l = x;
        for (int i = 0; i < count; i++) {
            g = l/10;
            number[i] = g;
        }
        for (int i = 0; i < count; i++) {
            if(!(number[number.length - i - 1] == x/10)){
                return true;
            }
            x /= 10;
        }
        return false;
    }

}
