interface Demo{
    void hello();
    default void show()
    {
        System.out.println("This show method is in interfce Demo");
    }
}
interface MyDemo{
default void show()
{
    System.out.println("This show method is in interface Mydemo");
}
}
class DemoImp implements Demo,MyDemo
{
    public void hello()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        Demo.super.show();
        MyDemo.super.show();
    }
}
public class InterfaceSample
{
    public static void main(String[] args)
    {
        Demo obj=new DemoImp();
        obj.hello();
        obj.show();
    }
}