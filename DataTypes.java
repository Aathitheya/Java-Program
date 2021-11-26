public class DataTypes{
    public static void main(String[] args){
        int i=5;                    //4bytes
        short s=5;                  //2bytes
        byte b=4;                   //1bytes
        long l=5000000l;            //8bytes
        float f=5.5f;
        double d=5.5;        
        char c='A';
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        c=67;
        System.out.println(c);
        double n=5;              //implicit conversion
        System.out.println(n);
        int k=(int)5.51;         //explicit conversion
        System.out.println(k);
    }
}