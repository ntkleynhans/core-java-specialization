package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum {


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        ArrayList<T> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        arr.add(z);;
        return Collections.max(arr);
    }
}
