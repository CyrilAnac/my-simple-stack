package deqo.cana.mysimplestack;

import java.util.EmptyStackException;

/**
 * Simple stack is an implementation of the interface
 *[ISimpleStack]. This stack have a SIZE.
 */
public class SimpleStack implements ISimpleStack {
    private final int SIZE = 10;
    private Item[] stack = new Item[SIZE];
    private int itemNumber = 0;

    SimpleStack(Item... values) {
        for (Item val :values) {
            stack[itemNumber] = val;
            itemNumber++;
        }
    }

    @Override
    public boolean isEmpty() {
        return itemNumber == 0;
    }

    @Override
    public int getSize() {
        return itemNumber;
    }

    @Override
    public void push(Item item) {
        if(itemNumber < SIZE){
            stack[itemNumber++] = item;
        }
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack[itemNumber-1];
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item[] stack2 = new Item[SIZE];
        if (getSize() - 1 >= 0) System.arraycopy(stack, 0, stack2, 0, getSize() - 1);
        else throw new EmptyStackException();
        Item removed = stack[itemNumber-1];
        itemNumber--;
        stack = stack2;
        return removed;
    }

    public void printStack(){
        for (int i =0 ; i < getSize() ; i++) {
            System.out.print(stack[i].value+" ");
        }
    }

}
