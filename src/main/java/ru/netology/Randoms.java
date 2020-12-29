package ru.netology;

import java.util.*;

public class Randoms implements Iterable<Integer> {

    private int min;
    private int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        random = new Random();
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min + 1);
            }
        };
    }
}
