package com.DScode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("da");
        list.add("dai");
        list.stream().forEach(System.out::println);
        int[] numbers={1,2,5,3};
        Integer[] numb=new Integer[2];
        numb[1]=12;
        int[][] twoD={{1,2},{3,4}};//new int[2][2];
        System.out.println(Arrays.deepToString(twoD));
        //Arrays.stream(twoD).forEach(x-> System.out.println(Arrays.toString(x)));
       // System.out.println(Arrays.binarySearch(numbers,5));
      //  Arrays.stream(numb).filter(Objects::nonNull).forEach(System.out::println);
       // Arrays.stream(numbers).forEach(System.out::println);
    }
}