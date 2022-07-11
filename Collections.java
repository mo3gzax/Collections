package com.Collections;
import java.util.*;
class Collections {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Marouane");
        list.add("Ben");
        list.add("Jack");
        list.add("John");
        Iterator itr=list.iterator();
        System.out.println("Example 1");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Example 2");
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ben");
        al.add("Jack");
        al.add("John");
        al.add("Marouane");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Example 3");

        Vector<String> v=new Vector<String>();
        v.add("John");
        v.add("Marouane");
        v.add("Jack");
        v.add("Ben");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Example 4");

        Stack<String> stack = new Stack<String>();
        stack.push("Jack");
        stack.push("Marouane");
        stack.push("Ben");
        stack.push("John");
        stack.push("lw");
        stack.push("q");
        stack.pop();
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Example 5");

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("MB");
        deque.add("depp");
        deque.add("srv");
        for (String str : deque) {
            System.out.println(str);
        }

    }
}
