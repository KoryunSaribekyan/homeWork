package org.HomeWorks2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Iterator;


public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);
        ArrayList<Integer> tempList = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 != 0) {
                tempList.add(number);
            }
        }
        list = tempList;

        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        int min = list.get(0);
        int max = list.get(list.size()-1);
        double middle = 0;

        for (int i = 0; i < list.size(); i++) {
            middle = (middle + list.get(i));
        }
        middle = middle/list.size();
        System.out.println(min+" |" + max + " |"+ middle);
    }
    }
