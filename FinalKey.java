class Abc{
    final int i=7;
    public void FinalVariable()
    {
        System.out.println("This i is constant due to final keyword,i=" + i);
    }
    public final void show()                    //this method cannot overrided because it is final method.
    {
        System.out.println("This is final method");
    }
}
class B extends Abc{

}
final class C
{
    public void display()
    {
        System.out.println("This is final Class");          //this class cannot be extended by other class because of the final class
    }
}
public class FinalKey
{
    public static void main(String[] args)
    {
        B obj1=new B();
        obj1.FinalVariable();
        obj1.show();
        C obj2=new C();
        obj2.display();
    }
}