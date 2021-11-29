class This{
    int num1,num2;
    public This()
    {
      num1=0;
      num2=0;
    }
    public This(int num1,int num2)
    {
       this.num1=num1;
       this.num2=num2;
    }
}
public class ThisKeyword{
    public static void main(String[] args)
    {
       This obj=new This(6,7);
       System.out.println(obj.num1);
       System.out.println(obj.num2);
    }
}