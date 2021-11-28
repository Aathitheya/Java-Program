class Add{
    int n1;
    int n2;
    int result;
    public void Perform()
    {
       result=n1+n2;
    }
} 



public class Object
{
    public static void main(String[] args)
    {
       Add obj=new Add();
       obj.n1=5;
       obj.n2=2;
       obj.Perform();
       System.out.println(obj.result);    
    }
}