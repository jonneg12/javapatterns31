package ru.netology;

import java.util.*;

public class Values {

    int min;
    int max;
    int stopValue;

    public void getValue() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter min value: ");
                min = scanner.nextInt();
                System.out.print("Enter max value: ");
                max = scanner.nextInt();
                System.out.print("Enter stop value: ");
                stopValue = scanner.nextInt();
                if (stopValue > max || stopValue < min || min > max) {
                    System.out.println("Wrong input, try again!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("It should be an integer value! Try again!");
            }
        }
    }
}
