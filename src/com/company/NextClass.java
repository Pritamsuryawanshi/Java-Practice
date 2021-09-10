package com.company;

public class NextClass {

    private int value;
    private int valueTwo;

    public NextClass(int value, int valueTwo) {
        this.value = value;
        this.valueTwo = valueTwo;
    }

    @Override
    public String toString() {
        return "NextClass{" +
                "value=" + value +
                ", valueTwo=" + valueTwo +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }
}
