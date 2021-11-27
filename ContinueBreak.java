public class ContinueBreak{
    public static void main(String[] args){
        for(int i=0;i<=9;i++)
        {
            if(i==5)
            continue;
            if(i==7)
            break;
            System.out.println(i);
        }
    }
}