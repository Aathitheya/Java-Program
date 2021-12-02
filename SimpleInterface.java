interface Abc
{
    void show();
}
class implementor implements Abc
{
    public void show()
    {
        System.out.println("This is an example of Interface");
    }
}
public class SimpleInterface
{
    public static void main(String[] args)
    {
       Abc obj=new implementor();
       obj.show();
    }
}