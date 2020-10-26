package deqo.cana.mysimplestack;

import org.junit.Before;
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
    public void StackConstructor(){
        SimpleStack stack2 = new SimpleStack(item1,item2);
        assertEquals("The new stack should contains 2 items",2,stack2.getSize());
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

    @Test //Push is also tested here
    public void getSizeWithTwoElmts() {
        stack.push(item1);
        stack.push(item2);
        assertEquals("Stack shoud have 2 elements", 2, stack.getSize());
    }

    @Test
    public void pushOutOfBounds() {
        for (int i = 0; i< 11; i++){
            stack.push(item1);
        }
        assertEquals("Stack shoud have 10 elements", 10, stack.getSize());
    }

    @Test
    public void peek() throws EmptyStackException {
        stack.push(item1);
        stack.push(item2);
        assertSame("Peek should return the last item pushed", item2, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void peekOnEmptyStack() throws EmptyStackException {
        stack.peek(); // should throws an EmptyStackException .
    }

    @Test
    public void pop() {
        stack.push(item1);
        stack.push(item2);
        assertSame("Pop should return the element popped", item2, stack.pop());
        stack.pop();
        assertTrue("two pop should empty the stack", stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        stack.pop(); // should throws an EmptyStackException .
    }
}