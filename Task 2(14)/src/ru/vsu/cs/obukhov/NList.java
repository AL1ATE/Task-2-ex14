package ru.vsu.cs.obukhov;
import java.util.ArrayList;
import java.util.List;


public class NList {
    private List<Integer> list;

    NList() {
        this.list = new ArrayList<>();
    }

    NList(int... value) {
        this();
        addAll(value);
    }

    public void add(int number) {
        this.list.add(number);
    }

    public void addAll(int... value) {
        if (value != null) {
            for (int number : value) {
                add(number);
            }
        }
    }

    public void makePareNumberSum() {
        List<Integer> result = new ArrayList<>();
        for (int index = 1; index < this.list.size(); index += 2) {
            result.add(get(index - 1) + get(index));
        }
        if (this.list.size() % 2 != 0) {
            result.add(get(length() - 1));
        }
        this.list = result;
    }

    public int get(int in) {
        return this.list.get(in);
    }

    public void remove(int in) {
        this.list.remove(in);
    }
    
    public int length() {
        return this.list.size();
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}

