class Abc{
    public void show()
    {
        System.out.println("Hi");
    }
}
interface Write
{
      void write();
}
interface Read
{
    void ReadBook();
}
class pen extends Abc implements Write,Read
{
    public void write()
    {
        System.out.println("I am writing in pen");
    }
    public void ReadBook()
    {
        System.out.println("I am reading Book which is written in pen");
    }
}
class pencil extends Abc implements Write,Read
{
    public void write()
    {
        System.out.println("I am writing in pencil");
    }
    public void ReadBook()
    {
        System.out.println("I am reading Book which is written in pencil");
    }
}
public class Interface{
public static void main(String[] args)
{
    Write obj=new pen();
    Write pc=new pencil();
    obj.write();
    Read ob=new pen();
    ob.ReadBook();
    Read pc1=new pencil();
    pc.write();
    pc1.ReadBook();
    pen p=new pen();
    p.show();
    
}
}