class calc{
    int n1;
    int n2;
    int result;
    public calc()
    {
      n1=5;
      n2=2;
      System.out.println("This is Default constructor");
    }
    public calc(int k,int m)
    {
        n1=k;
        n2=m;
        System.out.println("Hello");
    }

}
public class Constructor {
    public static void main(String[] args){
        calc hi=new calc();
        System.out.println(hi.n1);
        System.out.println(hi.n2);
        calc obj=new calc(6,7);
        System.out.println(obj.n1);
        System.out.println(obj.n2);
    }
}