package com.DScode;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue  {
    public static void main(String[] args) {
       // .offer for size restricted queue
        //.remove return ecxception if queue is empty while .poll return null when queue is empty
        Queue<Person> superMarket=new LinkedList<>();
        superMarket.offer(new Person("thejas",23));
        superMarket.add(new Person("anjaley",25));
        superMarket.add(new Person("aswin",25));
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek().name);
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());

    }
    static record Person(String name,int age){}
}
