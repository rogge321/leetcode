package com.panlong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogge on 2017/4/3.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("This is the first project!");

        List<String> test = new ArrayList<String>();

        test.add("123");

        System.out.println(test);

        ListTest(test);

        System.out.println(test);

        System.out.println("modify 1");
        System.out.println("modify 3");
    }


    public static void ListTest(final List<String> test) {
        test.clear();

    }
}
