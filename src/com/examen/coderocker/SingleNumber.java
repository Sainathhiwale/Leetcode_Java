package com.examen.coderocker;

import java.util.HashSet;
import java.util.Set;
/* given a non-emoty array of integer nums, every element apperars twice execpt for one, find the
   that single one you must implement a solution with linear runtime complexity and use constant extra space.
* */
public class SingleNumber {
    public static void main(String[] args) {
        int [] ary = new int[]{4,1,2,1,2};
        int ans = new SingleNumber().singleNum(ary);
        System.out.println("single number of non empty arraay is:"+ans);
    }

    public int singleNum(int [] num){
        if (num.length==1){
            return num[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<num.length;i++){
            if (set.contains(num[i])){
                set.remove(num[i]);
            }else {
                set.add(num[i]);
            }
        }
        return set.iterator().next();
    }
}
