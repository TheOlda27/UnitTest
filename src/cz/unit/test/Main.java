package cz.unit.test;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack("Prvni string");
	    System.out.println(stack.peek());
        stack.push("Druhy string");
	    System.out.println(stack.peek());
		stack.push("Treti string");
	    System.out.println(stack.pop());
	    System.out.println(stack.peek());
    }
}
