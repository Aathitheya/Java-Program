public class ForEachLoop{
    public static void main(String[] args)
    {   
        System.out.println("For one Dimensional Array");
        int a[]={1,2,3,4};
        for(int k:a)
        {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("For Two Dimensional Array");
        int d[][]={
                     {1,2,3,4},
                     {2,4,6},
                      {7,8,3,1,9,5}
                    };
            for(int l[]: d)
            {
                for(int n: l)
                {
                    System.out.print(n+" ");
                }
                System.out.println();
            }
    }
}