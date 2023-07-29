package Entitites;

import java.util.ArrayList;

public class NumberList {
    ArrayList<Integer> numberList;

    public NumberList() {}
    public NumberList(ArrayList<Integer> numberList) {
        this.numberList = numberList;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(ArrayList<Integer> numberList) {
        this.numberList = numberList;
    }

    @Override
    public String toString() {
        return "Lista de números" + numberList;
    }
}
