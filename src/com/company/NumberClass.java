package com.company;

public class NumberClass {

    private int isin;
    private int key;

    public NumberClass(int key, int isin) {
        this.key = key;
        this.isin = isin;
    }

    public int getIsin() {
        return isin;
    }

    public void setIsin(int isin) {
        this.isin = isin;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "NumberClass{" +
                "firstNumber=" + isin +
                ", key=" + key +
                '}';
    }
}
