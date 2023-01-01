package Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args){

        //Queue
        Queue<String> planets = new LinkedList<>();
        planets.add("Mercury"); // Last element
        planets.add("Venus");
        planets.add("Earth");
        planets.offer("Mars");//First Element



        //add  = enqueue, offer()
        //remove = dequeue. poll()
        //planets.poll();

        //System.out.println(planets.peek());





        //Priority Queue
        Queue<Double> grades = new PriorityQueue<>();
        grades.add(1.6);
        grades.add(5.6);
        grades.add(4.6);

        //There are multiple ways to iterate through the Queue.
        // The most famous way is converting the queue to the array and traversing using the for loop.
        // However, the queue also has an inbuilt iterator which can be used to iterate through the queue.


        Iterator iterator = grades.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        while (!grades.isEmpty()){
//            //Display and remove each element
//            System.out.println(grades.poll());
//        }

    }
}
