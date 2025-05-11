package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String string = console.nextLine();
            strings[i] = string;
        }
        for (int i = 0; i < 6; i++) {
            String curString = strings[i];
            for (int j = i+1; j < 6; j++) {
                if (curString == null) {
                    break;
                }
                if (curString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
