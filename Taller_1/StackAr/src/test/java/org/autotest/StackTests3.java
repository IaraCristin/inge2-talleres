package org.autotest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    // Tests de StackTests2.java
    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    // COMPLETAR
    public void testConstructorWithCapacityZero() throws Exception {
        Stack stack = createStack(0);
    }

    public void testToHashMethod() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        int first = stack.hashCode();
        stack.push(43);
        int second = stack.hashCode();
        assertNotEquals(first, second);
    }

    public void testEqualsItself() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.equals(stack));
    }

    public void testDifferentToNull() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(null));
    }

    public void testDifferentToAnotherClass() throws Exception {
        Stack stack = createStack();
        String anotherClass = "anotherClass";
        assertFalse(stack.equals(anotherClass));
    }

    public void testEqualsWithDifferents() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        Stack anotherStack = createStack();
        assertFalse(stack.equals(anotherStack));
    }

    public void testPopIsLastPushed() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        assertEquals(stack.pop(), 42);
    }

    public void testEqualsToAnother() throws Exception {
        Stack stack = createStack();
        Stack anotherStack = createStack();
        assertTrue(stack.equals(anotherStack));
    }
}
