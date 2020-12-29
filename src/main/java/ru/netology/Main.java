package ru.netology;

public class Main {

    public static void main(String[] args) {

        Values values = new Values();
        values.getValue();

        int counter = 0;
        for (int r : new Randoms(values.min, values.max)) {
            System.out.println(r + " >> ");
            counter++;
            if (r == values.stopValue) {
                System.out.println("Got number " + values.stopValue + "! Let's end! It was " + counter + " spins.");
                break;
            }
        }
    }
}
