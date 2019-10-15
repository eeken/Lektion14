package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public class GenericClass2 {

    private Collection c;

    GenericClass2(Collection c){
        this.c = c;
    }

    public void addElement(Object element){
        c.add(element);
    }

    public int getSize(){
        return c.size();
    }

    public String toString(){
        return c.toString();
    }
}
