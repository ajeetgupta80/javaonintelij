package com.ajeet;

import java.util.HashMap;
import java.util.Map;

public class romantoint {
    public static void main(String[] args) {
        String s = "VI";
        int ans = romanToInt(s);
        System.out.println(ans);

    }
    static int romanToInt(String s) {
        Map<Character,Integer> RomanVal = new HashMap<>();
        RomanVal.put('I',1);
        RomanVal.put('V',5);
        RomanVal.put('X',10);
        RomanVal.put('L',50);
        RomanVal.put('C',100);
        RomanVal.put('D',500);
        RomanVal.put('M',1000);
        int sum = 0;
        char[] Array = s.toCharArray();
        int Lenght = s.length();
        for(int i = 0 ;i < Lenght - 1; i++) {
            if(RomanVal.get(Array[i]) >= RomanVal.get(Array[i + 1])) {
                sum+=RomanVal.get(Array[i]);
            }else{
                sum-=RomanVal.get(Array[i]);
            }
        }
        return sum+RomanVal.get(Array[Array.length - 1]);
    }
}
