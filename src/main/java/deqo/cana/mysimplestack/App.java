package deqo.cana.mysimplestack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Item one = new Item(1);
        Item two = new Item(2);

        SimpleStack mystack = new SimpleStack(one,two);

        System.out.println(mystack.getSize());
    }
}
