package LinkedLists;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> planets = new LinkedList<>();

        //                  Singly Linked List
        //      Node                Node                Node
        //[data | address] ->   [data | address] -> [data | address]


        //                  Doubly Linked List
        //      Node                Node                Node
        //[address | data | address] <->   [address | data | address] -> [address |data | address]

        //advantages
        //1. Dynamic Data Structure (allocates memory while running)
        //2. Adding a node and deleting a node has a time complexity of 0(1)
        //3. No/Low memory waste

        //disadvantages
        //1. Greater memory usage (additional pointers)
        //2. No random access of elements
        //

        //The LinkedList class implements the List interface as well as the Deque interface
        planets.add("Mars");
        planets.add("Jupiter");
        planets.push("Neptune");
        planets.addFirst("Earth");



        //Iterate through the linkedlist
        for (int i = 0; i < planets.size();i++){
            System.out.println(planets.get(i));
        }

    }
}
