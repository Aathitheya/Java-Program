class A
{
    public void show()
    {
        System.out.println("In class A");
    }
}
class B extends A
{
     @Override
    public void show()
    {
        System.out.println("In class B");
    }
}
public class MethodOverride{
    public static void main(String[] args)
    { 
        B obj=new B();
        obj.show();
    }
}