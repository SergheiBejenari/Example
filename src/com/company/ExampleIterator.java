package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterator {
    static ArrayList<String> createStates() {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        return states;
    }

    static Iterator<String> remove() {
        Iterator<String> iter = createStates().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }
        return iter;
    }

    public static void main(String[] args) {
        createStates();
        remove();

      //  createStates().add("Moldova");
        System.out.println();
    }
}