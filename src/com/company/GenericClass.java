package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericClass<T1, T2> {

    private T1 t1;
    private T2 t2;
    private T1[] myList;
    int i = 0;
    private Collection c;

    public GenericClass(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public GenericClass(int size){
        myList = (T1[]) new Object[size];
    }

    public GenericClass(Collection c){
        this.c = c;
    }

    public void addElement(Object t1){
        c.add(t1);
    }

    public int getSize(){
        return c.size();
    }

    public T1[] getMyList() {
        return myList;
    }


    public void addToArray(T1 t1){
        if(i == myList.length) {
            System.out.println("No more space in array!");
            return;
        }
        myList[i] = t1;
        i++;
    }

    public T1 getElement(int pos){
        if(pos < 0 || pos >= i){
            System.out.println("No element there!");
            return null;
        }
        return myList[pos];
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return t1 + " " + t2;
    }

}
