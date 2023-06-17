package org.HomeWorks2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            list.add(input);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.parseInt(o2.split(" ")[3]) - Integer.parseInt(o1.split(" ")[3]);
                return result;
            }
        });
        for (String personInfo : list) {
            String[] parts = personInfo.split(" ");
            String lastName = parts[0];
            String firstName = parts[1];
            String middleName = parts[2];
            int age = Integer.parseInt(parts[3]);
            String gender = parts[4];

            String initials = firstName.charAt(0) + ". " + middleName.charAt(0) + ". ";
            String formattedInfo = lastName + " " + initials + age + " " + gender;
            System.out.println(formattedInfo);
        }
    }
}





