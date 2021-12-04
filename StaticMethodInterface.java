interface StaticMethod
{
    int i=7;                  //this is defaultly final int ie.Constant
    void show();
    static void display()
    {
        System.out.println("This is static method");
    }
}
public class StaticMethodInterface
{
    public static void main(String[] args)
    {
        StaticMethod.display();
    }
}