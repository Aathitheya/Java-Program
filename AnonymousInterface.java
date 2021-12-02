interface Abc
{
    void show();
}
public class AnonymousInterface
{
    public static void main(String[] agrs)
    {
        Abc obj=new Abc(){
                          public void show()
                          {
                              System.out.println("This is Anonymous For Interface");
                          }
                       };
        obj.show();
    }
}