package com.company;

public class Main {
    @Override
    public int hashCode() {
        return this.hashCode();
    }

    public static void main(String[] args) {
        Object object = new Object();
        Object obj =  new Object();
        int hCode;
        int hCode1;
        hCode = object.hashCode();
        hCode1 = obj.hashCode();
        System.out.println(hCode);
        System.out.println(hCode1);
    }
}