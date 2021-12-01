class A{
    public A()
    {
        System.out.println("In class A Default constructor");
    }
    public A(int i)
    {
        System.out.println("In class A int i parameter constructor");
    }
}
class B extends A
{
    public B()
    {
        super(7);         // default Super present in every constructor.
        System.out.println("In class B Default constructor");
    }
    public B(int i)
    {
        super(i);
        System.out.println("In class B int i parameter constructor");
    }
}
public class SuperMethod 
{
    public static void main(String[] args)
    {
        B obj=new B(7);
    }
}