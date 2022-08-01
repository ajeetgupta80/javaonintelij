package com.ajeet;

import java.util.HashMap;
import java.util.Map;

public class romantoint {
    public static void main(String[] args) {
        String s = "IX";
        int ans = romanToInt(s);
        System.out.println(ans);

    }

    static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        char[] arr = s.toCharArray();
        int Length = s.length();
        int sum = 0;
        for (int i = 0; i < Length - 1; i++) {
            if (roman.get(arr[i]) >= roman.get(arr[i + 1])) {
                sum += roman.get(arr[i]);
            } else {
                sum -= roman.get(arr[i]);
            }


        }
        return sum + roman.get(arr[arr.length - 1]);


    }
}
