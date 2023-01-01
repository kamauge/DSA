package Stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        //First position is 1
        Stack<String> stack = new Stack<String>();
        stack.push("Mercury"); // bottom most
        stack.push("Venus");
        stack.push("Earth");
        stack.push("Mars"); // top most


        String planet = stack.peek();
        System.out.println(planet);

        stack.pop();
        System.out.println(stack);
    }
}
