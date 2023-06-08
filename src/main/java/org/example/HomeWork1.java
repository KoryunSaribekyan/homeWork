package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {


    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2001);;
        int leadingZeros = Integer.numberOfLeadingZeros(i);
        int bitCount = 32 - leadingZeros;
        int n = bitCount - 1;
        ArrayList<Integer> m1 = new ArrayList<>();
        ArrayList<Integer> m2 = new ArrayList<>();
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if(j%n==0) m1.add(j);
        }
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if(j%n!=0) m2.add(j);
        }
        for (int num : m1) {
            System.out.print(num + " ,");
        }
        System.out.println();
        for (int num : m2) {
            System.out.print(num + " ,");
        }
    }
}
