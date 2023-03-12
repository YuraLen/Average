package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        int count = 0;

        while (value != 0) {
            sum += value;
            count++;
            value = scanner.nextInt();
        }

        int averageValue = sum / count;
        System.out.println(averageValue);
    }
}