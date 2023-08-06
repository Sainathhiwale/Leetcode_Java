package com.examen.coderocker;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
       System.out.println( new Fizzbuzz().fizzBuzz(num));
    }

    public List<String> fizzBuzz(int[] n) {
        List<String> res = new ArrayList();
        for (int i = 1; i <= n.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
