abstract class Write
{
    public abstract void penwrite();
}
class pen extends Write
{
    public void penwrite()
    {
        System.out.println("I am writing in pen");
    }
}
public class Abstract{
public static void main(String[] args)
{
    pen obj=new pen();
    obj.penwrite();
}
}