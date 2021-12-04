@FunctionalInterface
interface Abc{
    void lambdaexpression();
}
public class Lambda{
    public static void main(String[] args)
    {
        Abc obj=()->System.out.println("Lambda Expression");
        obj.lambdaexpression();
    }
}
