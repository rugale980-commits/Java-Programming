class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello constructor");
        this.i = no+1;
    }
    public void Display()
    {
        System.out.println("Inside Hello Display");
    }
}
class Hello1
{
    public int i ;
    public void fun()
    {
        System.out.println("Inside Hello1 fun ");
    }
}
class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);   // First Use
        System.out.println("Inside demo Constructor");
        this.i = a;              
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display "+i);        // 0
        System.out.println("Inside Display "+this.i);   // 51
        System.out.println("Inside Display "+super.i);  // 52   // secomd Use 
        super.Display();                // Third Use
    }
}
class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();

        Hello1 hobj = new Hello1();
        hobj.fun();
    }
}