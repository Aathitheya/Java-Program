class Perform
{
    public Perform()
    {
        System.out.println("Hi");
    }
    public Perform(int i,String op)
    {
        System.out.println(op);
    }
}
public class ConstructorOverload{
    public static void main(String[] args)
    {
        Perform func=new Perform(7,"Hello");
    }
}