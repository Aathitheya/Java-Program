import java.util.Scanner;
public class ScanforInteger
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();                     //or  int i=Integer.parseInt(sc.nextLine());
       int j=sc.nextInt();                     //or  int j=Integer.parseInt(sc.nextLine());
       System.out.println("I is " + i);
      System.out.println("J is " + j);
    }
}