package com.DScode;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<Person> ll=new LinkedList<>();
        ll.add(new Person("thejas",23));
        ll.add(new Person("anjaley",25));
        ListIterator<Person> listIterator=ll.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
    static record Person(String name,int age){}

}
