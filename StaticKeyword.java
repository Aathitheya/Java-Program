class Employe{
    int employeid;
    int salary;
    static String ceo;
    static
    {
        ceo="Mahesh";
    }
    public Employe(){
        employeid=1;
        salary=50000;
    }
    public void show(){
        System.out.println(employeid +":" +salary +":" +ceo);
    }
}
public class StaticKeyword{
    public static void main(String[] args){
        Employe navin=new Employe();
        Employe rahul=new Employe();
        navin.show();
        rahul.show();
    }
}