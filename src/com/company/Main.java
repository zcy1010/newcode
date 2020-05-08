package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int LKZ(int number) {
        if (number % 2 == 0) {
            return number / 2;
        } else {
            return 3 * number + 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String tx= bufferedReader.readLine();
//        System.out.println(tx);
        int number=Integer.valueOf(tx);
        System.out.println(LKZ(number));

    }
}
