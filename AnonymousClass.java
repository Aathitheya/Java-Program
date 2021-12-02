class Anonym
{
    public void display()
    {
        System.out.println("This is  not Anonymous class");
    }
}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        Anonym obj=new Anonym()                                  //Anonymous class
                        {
                            public void display()
                            {
                                System.out.println("This is Anonymous class");
                            }
                        };
        obj.display();
    }
}