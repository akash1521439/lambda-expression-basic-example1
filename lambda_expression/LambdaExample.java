package com.example.jdbcexample.lambda_expression;

import java.util.ArrayList;
import java.util.List;

interface Operation<T>{
    T add(T x, T y);
}

public class LambdaExample {
    public static void main(String[] args){
        //Sum of two integer
        Operation<Integer> sum = (x,y)->x+y;
        int sumRes = sum.add(5,6);
        System.out.println(sumRes);

        //Concatenate as string
        Operation<String> stringOperation = (x,y)->x+y;
        String s = stringOperation.add("4","3");
        System.out.println(s);

        //Multiplication
        Operation<Integer> multiplication = (x,y)->x*y;
        int mulRes = multiplication.add(5,5);
        System.out.println(mulRes);

        //Using lambda expression to iterate over a List
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.forEach(x-> System.out.println(x));
        //arrayList.forEach(System.out::println);



    }

}
