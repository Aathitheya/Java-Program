class Outer{
    public void show()
    {
        System.out.println("Method of Outer class");
    }
    class Inner
    {
        public void display()
        {
            System.out.println("Method of Inner class");
        }
    }
}
public class InnerClass{
    public static void main(String[] args)
    {
        Outer obj=new Outer();
        obj.show();
        Outer.Inner obj1= obj.new Inner();
        obj1.display();
    }
}