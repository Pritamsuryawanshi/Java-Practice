package com.company;

public class ObjectClass {
    String key;
    String value;
    int abc;

    public ObjectClass() {
    }

   /* public ObjectClass(String key, String value) {
        this.key = key;
        this.value = value;
    }*/

    public ObjectClass(String key, String value, int abc) {
        this.key = key;
        this.value = value;
        this.abc = abc;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    @Override
    public String toString() {
        return
                "itemCode:\"" + key + '\"' +
                        ", displayName:\"" + value + '\"';
    }
}
