package com.example.month2hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("enter name" + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            listA.add(userInput);
        }

        System.out.println("ListA contains: ");
        for (String names : listA) {
            System.out.println(names);
        }

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("enter name" + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            listB.add(userInput);
        }

        System.out.println("ListB contains: ");
        for (String names : listB) {
            System.out.println(names);
        }

        System.out.println(listA);
        System.out.println("============");
        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);
        int size = listA.size();
        for (int i = 0; i < size; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(size - 1 - i));
        }
        System.out.println("============");

        System.out.println("ListC: ");
        for (String item : listC) {
            System.out.println(item);
        }

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted listC: ");
        for (String item : listC) {
            System.out.println(item);
        }

        scanner.close();

//        A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1

    }
}
