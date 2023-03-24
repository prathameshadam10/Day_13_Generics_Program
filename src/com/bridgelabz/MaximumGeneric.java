package com.bridgelabz;

public class MaximumGeneric<T extends  Comparable<T>>{
    private T a;
    private T b;
    private T c;

    public MaximumGeneric(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T findMax(){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
//        test case for integers
        MaximumGeneric<Integer> intMax = new MaximumGeneric<>(10,20,2);
        System.out.println(intMax.findMax());
//        test case for floats
        MaximumGeneric<Float> floatMax = new MaximumGeneric<>(2.3f,3.4f,7.8f);
        System.out.println(floatMax.findMax());
//        test case for Strings
        MaximumGeneric<String> stringMax = new MaximumGeneric<>("Tendulkar","Ramesh","Sachin");
        System.out.println(stringMax.findMax());
    }
}
