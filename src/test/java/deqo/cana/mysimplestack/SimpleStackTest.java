package deqo.cana.mysimplestack;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;


public class SimpleStackTest {
    private SimpleStack stack;
    private Item item1;
    private Item item2;

    @Before //fixture
    public void setUp() {
        stack = new SimpleStack();
        item1 = new Item(4);
        item2 = new Item(7);
    }

    @Test
    public void testCreateEmptyStack() {

    }

    @Test
    public void isEmpty() {
        assertTrue("A new stack should be empty", stack.isEmpty());
    }

    @Test
    public void isNotEmpty() {
        stack.push(item1);
        assertFalse("Stack should have one element", stack.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test
    public void getSizeWithTwoElmts() {
        stack.push(item1);
        stack.push(item2);
        assertEquals("Stack shoud have 2 elements", 2, stack.getSize());
    }

    @Test
    public void push() throws EmptyStackException {

    }

    @Test
    public void peek() {
    }

    @Test
    public void pop() {
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        stack.pop(); // should throws an EmptyStackException .
    }



}