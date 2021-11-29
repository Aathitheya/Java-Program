class Method{
    int n1,n2;
    public void add()
    {
        System.out.println(n1+n2);
    }
    public void add(int i,int j)
    {
        System.out.println(i+j);
    }
    public void add(double i,double j)
    {
        System.out.println(i+j);
    }
}
public class MethodOverload{
    public static void main(String[] args)
    {
        Method perform=new Method();
        perform.add(3.4,4.2);
    }
}