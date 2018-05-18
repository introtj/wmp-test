package com.wmp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("");

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.equals("")) {
                    return 1;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                } else if (o1.charAt(0) > o2.charAt(0)) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });

//        String result = Arrays.toString(str);
        System.out.println(new StringBuilder(String.valueOf(str)).toString());
    }

}
