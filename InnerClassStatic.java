class Out{
    static int a;
    public static void show()
    {
        System.out.println("Method of Out class");
    }
    static class In
    {
       public static void display()
       {
           System.out.println("Method of In class");
       }
    }
}
public class InnerClassStatic{
    public static void main(String[] args)
    {
        Out obj=new Out();
        Out.show();
        Out.In obj1=new Out.In();
        obj1.display();
    }
}