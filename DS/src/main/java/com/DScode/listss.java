package com.DScode;

import java.util.ArrayList;
import java.util.List;

public class listss {
    public static void main(String[] args) {
        List<String> colours=new ArrayList<>();
        List<String> coloursImmutable=List.of("red","green","blue");
        //coloursImmutable.add("hi");
        coloursImmutable.forEach(System.out::println);

        colours.add("yellow");
        //colours.add(12);
        System.out.println(colours.get(0));
        colours.forEach(System.out::println);
    }
}
