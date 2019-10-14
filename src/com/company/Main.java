package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)5,(Integer)2,(Integer)3, emptyIntArr);
        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Awesome","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);
    }
}
