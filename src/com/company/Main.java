package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    // array rotation
    //
    // private static Object ObjectClass;

    public static void main(String[] args) throws IOException {



       /* int counter = 1;
        int found = 0;

        String[] a = {"pritam", "saili", "rupak", "pritam", "geeta", "jay", "john", "rupak"};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
                    found++;
                    break;
                }
            }
            if (found == 0) {
                System.out.println(a[i]);
            }
            if (found > 0)
                found--;
        }*/

        // 3 5 7 9  2 4 6 8 10
       /* String[] a = {"pritam", "saili", "rupak", "pritam", "geeta", "jay", "john", "rupak"};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    found++;
                    break;
                }
            }
            if (found == 0) {
                System.out.println(a[i]);
            }
            if (found > 0)
                found--;
        }*/


        //HALF PYRAMID
        /*for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

      /*  for (int i = 5; i > 0; i--) {
            for (int j = 1; j < 6; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
                for (int m = 5; m > i ; m--) {
                    System.out.print("*");
                }
                System.out.println();

        }*/

        /*ObjectClass objectClass = new ObjectClass("key", "value", 1);
        NumberClass numberClass = new NumberClass(1, 0);
        NumberClass numberClass1 = new NumberClass(2, 2);
        NumberClass numberClass2 = new NumberClass(3, 2);
        NumberClass numberClass3 = new NumberClass(4, 3);
        List<NumberClass> listOfObjects = Arrays.asList(numberClass, numberClass1, numberClass2, numberClass3);
        HashMap<Integer, NumberClass> hashMapOfObjects = new HashMap<>();

        //hashMapOfObjects.put(numberClass.firstNumber, numberClass);

        int isinString = 2;

        listOfObjects.stream()
                .filter(number -> number.getIsin() == isinString)
                .forEach(n ->
                {
                    ObjectClass objectClass1 = new ObjectClass("key", "value", 1);
                    objectClass1.setAbc(n.getKey());
                    hashMapOfObjects.put(n.getKey(), n);
                });
       *//* listOfObjects.stream()
                .filter(number -> number.firstNumber == myNumber)
                .forEach(n ->
                        hashMapOfObjects.put(n.key, n)
                );*//*


        System.out.println("here");

        System.out.println(Collections.singletonList(hashMapOfObjects));

        System.out.println("there");*/

     /*   listOfObjects.forEach(number ->
                System.out.println(number.firstNumber)
        );*/
       /* NextClass nextClass = new NextClass(1, 2);
        ObjectClass objectClass = new ObjectClass("j", "pritam");
        HashMap<String, Object> map = new HashMap<>();
        map.put("pritam", nextClass);
        map.put("saili", objectClass);

        List<String> header = Arrays.asList(
                "Name", "Role", "prr"
        );

        List<ObjectClass> list = new ArrayList<>();
        for (String all : header) {
            ObjectClass objectClass1 = new ObjectClass();
            objectClass1.setKey(all);
            list.add(objectClass1);
            map.put("kk", list);
        }
        list.forEach((n) ->
                System.out.println("list data is" + n)
        );*/
       /* map.put("kk", header);
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
*/
        //Creating objects
       /* ObjectClass objectClass = new ObjectClass("1", "pritam");
        ObjectClass objectClass2 = new ObjectClass("2", "saili");
        ObjectClass objectClass3 = new ObjectClass("3", "batla");
        ObjectClass objectClass4 = new ObjectClass("4", "bhangi");
        System.out.println("results");
        System.out.println(objectClass4);*/

      /*  List<String> strings = new ArrayList<>();
        strings.add("itemCode : \""+objectClass.key+"\""+", displayName : \""+objectClass.value+"\"");

        System.out.println(strings.get(0));*/

        //adding objects in list
       /* Object[] objects = Arrays.asList(objectClass.toString(), objectClass2.toString(), objectClass3.toString(), objectClass4).toArray();

        for (Object temp : objects) {
            System.out.println(temp);
        }*/
        //hashmap declaration
       /* HashMap<String, String> mapper = new HashMap();

        List<String> strings = new ArrayList<>();
        //adding into hashmap
       *//* for (ObjectClass temp : objects) {
            mapper.put(temp.key, temp.value);
            strings.add("key " +"'" + temp.key+"'" + " bey " + temp.value);
        }*//*

        System.out.println("list \" of data== \"Preeti\"  ");
        System.out.println(strings);
        //adding objects into the list
      *//*  for (ObjectClass tempObject : objects) {
            System.out.println("key = " + tempObject.key + " value =" + tempObject.value);
        }*//*

        System.out.println("hashmap");
        mapper.forEach((k, v) ->
                System.out.println("Key = "
                        + k + ", Value = " + v));

        System.out.println("objects are");
        System.out.println(objectClass.toString());


    }*/
       /* List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]
                {"John", "Doe", "38", "Comment Data\nAnother line of comment data"});
        dataLines.add(new String[]
                {"Jane", "Doe, Jr.", "19", "She said \"I'm being quoted\""});
    }

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException {
        File csvOutputFile = new File("CSV_FILE_NAME");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    .map(this::convertToCSV)
                    .forEach(pw::println);
        }
        assertTrue(csvOutputFile.exists());*/
// csv code
        List<List<String>> rows = Arrays.asList(
                Arrays.asList("Jean", "author", "Java"),
                Arrays.asList("David", "editor", "Python"),
                Arrays.asList("Scott", "editor", "Node.js")
        );
        FileWriter csvWriter = new FileWriter("C:\\Users\\Pritam\\Downloads\\news.csv");
        List<String> header = Arrays.asList(
                "Name", "Role", "Topic"
        );

        List<List<String>> subHeader = Arrays.asList(
                Arrays.asList("firstName", "SecondName", "LastName"),
                Arrays.asList("good", "bad"),
                Arrays.asList("nice", "awsm", "abc")
        );

        for (String headerData : header) {
            csvWriter.append(headerData);
            csvWriter.append(",");
        }

        csvWriter.append("\n");
        for (List<String> rowData : subHeader) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append(",");
        }
        csvWriter.flush();
        csvWriter.close();
        csvWriter.append("Name");

        csvWriter.append("Role");
        csvWriter.append(",");
        csvWriter.append("Topic");
        csvWriter.append("\n");

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }
    }
}
