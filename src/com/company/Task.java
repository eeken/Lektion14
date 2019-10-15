package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task {

    public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr) {

        // Display array elements
        emptyArr[0] = param1;
        emptyArr[1] = param2;
        emptyArr[2] = param3;

        return emptyArr;

    }

    public static <T1, T2> void doThings(T1 param1, T2 param2){
        System.out.println(param1);
        System.out.println(param2);
    }

    public static <T1 extends Collection, T2 extends Collection> int getSumOfCollection(T1 coll1, T2 coll2){
        return coll1.size() + coll2.size();
    }

    public static <T1 extends Collection, T2 extends Collection> Collection biggestCollection(T1 coll1, T2 coll2){
        if(coll1.size() > coll2.size()){
            return coll1;
        }
        return coll2;
    }

    public static <T1 extends Collection, T2 extends Collection> Collection copyCollection(T1 coll1, T2 coll2) {
        for(Object element : coll1){
            coll2.add(element);
        }
        return coll2;
    }

    public static <T1> T1[] changePos(T1[] array, int pos1, int pos2){
        var temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        return array;
    }

    public static <T1 extends Number, T2 extends Number> float addNumbers(T1 t1, T2 t2){
        return t1.floatValue()+t2.floatValue();
    }


    public static <T extends HasDescription> T showMenuAndGetChoice(T[] menuItems){

        System.out.println("Welcome to the bank.\nMake a choice:\n-----");
        int i=1;
        for (T menuItem : menuItems){
            System.out.println(i+" "+menuItem.getDescription());
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int choiceIndex = scanner.nextInt();
        //MenuItem.values() => [ADD_SALARY_ACCOUNT, ADD_SAVINGS_ACCOUNT, ..]
        return menuItems[choiceIndex-1];

    }
}
