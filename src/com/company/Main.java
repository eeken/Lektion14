package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)5,(Integer)2,(Integer)3, emptyIntArr);
        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Awesome","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);

        Task.doThings("hej", 2);

        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("hello");
        myStrings.add("world");

        Stack<Integer> ints = new Stack<>();
        ints.push(1);
        ints.push(7);
        ints.push(9);

        System.out.println(Task.getSumOfCollection(myStrings, ints));

        MainMenu mainChoice = Task.showMenuAndGetChoice(MainMenu.values());
        CustomerMenu customerChoice = Task.showMenuAndGetChoice(CustomerMenu.values());
        System.out.println(mainChoice);
        System.out.println(customerChoice);*/



        // GenericClass<Student, Student> hej = new GenericClass(new Student(5, "OLA"), new Student(2, "KORV"));
        // System.out.println(hej);
        GenericClass<Student, String> genericClass2 = new GenericClass(3);
        // System.out.println(genericClass2);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        Student student = new Student(5, "hejhej");
        Student student2 = new Student(7, "ola");
        Student student3 = new Student(9, "korv");

        genericClass2.addToArray(student);
        genericClass2.addToArray(student2);
        genericClass2.addToArray(student3);
        /*System.out.println(genericClass2.getElement(0));
        System.out.println(genericClass2.getElement(1));
        System.out.println(genericClass2.getElement(5));
        // System.out.println(genericClass2.getMyList().toString());
        //genericClass2.addToArray(i3);*/


        // hemuppgift 1
        System.out.println(Task.addNumbers(5.5, 2.75));

        // hemuppgift 2 (varför funkar ej med int?)
        //Integer[] array1 = {1, 2, 3, 4};
        String[] array = {"1", "3", "5"};
        /*String[] towns = {"Lund", "Helsingborg"};*/
        String[] changed = Task.changePos(array, 0, 1);
        System.out.println("Switched places on towns: "+changed[0]);

        // hemuppgift 3
        ArrayList<Integer> someStrings = new ArrayList<>();
        someStrings.add(1);
        someStrings.add(2);
        someStrings.add(2);
        someStrings.add(2);
        Stack<Integer> nummer = new Stack<>();
        nummer.push(1);
        /*nummer.push(1);
        nummer.push(1);
        nummer.push(1);*/
        System.out.println("Biggest collection: "+Task.biggestCollection(someStrings, nummer));

        // hemuppgift 4
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Integer> tomList = new ArrayList<>();
        Task.copyCollection(list, tomList);
        System.out.println("New list: " + tomList);

        // hemuppgift 5
        GenericClass2 g = new GenericClass2(tomList);
        g.addElement(5);
        System.out.println(g.getSize());
        System.out.println(g.toString());
    }
}
