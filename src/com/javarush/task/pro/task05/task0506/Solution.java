package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            int nums = console.nextInt();
            array[i] = nums;
        }
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
