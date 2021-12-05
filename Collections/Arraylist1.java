import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Arraylist1
{
    public static void main(String[] args)
    {
        //ArrayList is used to store an element in array which doesn't have fixed size.

       Collection <Integer> values = new ArrayList<Integer>();
       values.add(7);
       values.add(3);
       values.add(26);
       System.out.println(values);
       System.out.println();
       
       //for printing one by one value we using Iterator.
       
       Iterator<Integer> it=values.iterator();
       while(it.hasNext())  //hasnext() is used to find wheter the next element is present or not.
       {
       System.out.println(it.next());
       }
        System.out.println();
       //Printing elements y using enchanced forloop.
       for(int k:values)
       {
           System.out.println(k);
       }
    }
}