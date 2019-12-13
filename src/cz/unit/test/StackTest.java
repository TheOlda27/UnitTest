package cz.unit.test;

import junit.framework.TestCase;

public class StackTest extends TestCase {

    public void testPop() {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertEquals("3",stack.pop());
        assertEquals("2", stack.pop());

    }

    public void testPeek() {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertEquals("3",stack.peek());
        assertEquals("3", stack.peek());
    }
}