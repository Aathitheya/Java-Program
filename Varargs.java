class Var{
    public int add(int...n)
    {
        int s=0;
        for(int k:n)
        {
            s=s+k;
        }
        return s;
    }
}
public class Varargs{
    public static void main(String[] args)
    {
        Var obj=new Var();
        System.out.println(obj.add(1,4,5,7,3));
    }
}