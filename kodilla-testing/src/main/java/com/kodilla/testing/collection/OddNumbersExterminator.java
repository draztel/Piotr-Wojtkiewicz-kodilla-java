package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer>numbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1) {
                numbers.remove(i);
            }
        }
    }
}
