package com.DScode;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        //.size,.peek
        System.out.println(stack.toString());
    }
}
