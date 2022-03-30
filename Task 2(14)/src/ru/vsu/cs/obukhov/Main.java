package ru.vsu.cs.obukhov;

public class Main {

    public static void main(String[] args) {
            NList value = new NList(-5, -4,-3,-2,-1,0, 1, 2, 3, 4, 5);
            System.out.println(value);
            value.remove(0);
            System.out.println(value);
            value.add(6);
            value.addAll(1, 2, 3, 4);
            System.out.println(value);
            value.makePareNumberSum();
            System.out.println(value);
            value.remove(value.length() - 1);
            value.makePareNumberSum();
            System.out.println(value);
    }
}
