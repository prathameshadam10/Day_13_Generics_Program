package com.bridgelabz;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumGeneric<T extends  Comparable<T>>{
   private List<T> values;

    public MaximumGeneric(T... values) {
        this.values = Arrays.asList(values);
    }

    public T findMax() {
        Collections.sort(values);
        return values.get(values.size() - 1);
    }

    public static void main(String[] args) {
//        test case for integers
        MaximumGeneric<Integer> intMax = new MaximumGeneric<>(10,20,2,35,44);
        System.out.println(intMax.findMax());
//        test case for floats
        MaximumGeneric<Float> floatMax = new MaximumGeneric<>(2.3f,7.8f,8.9f,15.7f,5.5f);
        System.out.println(floatMax.findMax());
//        test case for Strings
        MaximumGeneric<String> stringMax = new MaximumGeneric<>("Sachin","Rohit","Jasprit","Laxmipati","TenDulkar");
        System.out.println("Test Case: The Maximum String is :"+ stringMax.findMax());
    }
}
