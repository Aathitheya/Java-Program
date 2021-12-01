class Add{                                             //1-super
    public int add(int i,int j)
    {
        return(i+j);
    }
}
class Sub extends Add                                  //1-sub        2-super             single inheritance
{
    public int sub(int i,int j)
    {
        return(i-j);
    }
}
class Multi extends Sub                                             //2-sub           mutilevel inheritance
{
    public int multi(int i,int j)
    {
        return(i*j);
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Multi ob=new Multi();
        int r1=ob.multi(5,3);
        int r2=ob.sub(10,3);
        int r3=ob.add(2,8);
        System.out.println("Additon: "+r3);
        System.out.println("Subtraction: "+r2);
        System.out.println("Multipication: "+r1);
    }
}