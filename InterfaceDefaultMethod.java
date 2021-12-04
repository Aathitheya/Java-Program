@FunctionalInterface
interface DefaultMethod
{
    void Method();
    default void show()                                                         //defaut method
    {                                              
        System.out.println("This is default method show in interface");
    }
    default void config()                                                      //default method
    {
        System.out.println("This is config method in interface");
    }
}
class Inter implements DefaultMethod
{
    public void Method()
    {
        System.out.println("hi");
    }
    public void config()                                                         //default method gets overrided
    {
        System.out.println("This is config method in class Inter");
    }
}
public class InterfaceDefaultMethod
{
    public static void main(String[] args)
    {
        DefaultMethod object=new Inter();
        object.Method();
        object.show();
        object.config();
    }
}