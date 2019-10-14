package com.company;

import java.util.ArrayList;

public class Task {

    public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr) {

        // Display array elements
        emptyArr[0] = param1;
        emptyArr[1] = param2;
        emptyArr[2] = param3;

        return emptyArr;

    }
}
