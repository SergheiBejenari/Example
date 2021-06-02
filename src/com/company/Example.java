package com.company;

public class Example {
    int a;
    int b;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Example obj = new Example(12,12);
        Example obj2 = new Example(12,12);
        System.out.println(obj.equals(obj2));

    }
}
