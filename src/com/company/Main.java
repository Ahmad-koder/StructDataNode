package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        MapNode mapNode = new MapNode();

        boolean flag = false;

        int choice;

        do {
            System.out.println("1 - Create data structure." +
                    "2 - Edit data structure." +
                    "3 - Save to file." +
                    "4 - Extract from file." +
                    "5 - Output Node." +
                    "6 - Exit");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    mapNode.makeNode();
                    flag = true;
                    break;

                case 2:
                    if(flag)
                        mapNode.redNode();
                    break;

                case 3:
                    if(flag)
                        mapNode.addFromFile();
                    break;

                case 4:
                    if(flag)
                        mapNode.addToFile();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Incorrect enter");
            }
        }while (choice != 5);
    }
}
