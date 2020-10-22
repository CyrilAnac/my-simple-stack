package deqo.cana.mysimplestack;

import java.util.EmptyStackException;

public class SimpleStack implements ISimpleStack {
    private final Item[] stack;

    SimpleStack(Item... values) {
        stack = values;
    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (int i = 0; i < stack.length; i++) {
            size++;
        }

        return size;
    }

    @Override
    public void push(Item item) {
        //add
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack[stack.length-1];
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item it = stack[stack.length-1];
        //remove
        return it;
    }

}
