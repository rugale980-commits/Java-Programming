abstract class Base
{
    public int i,j;
    public int Addition(int a, int b)
    {
      return a+b;
    }
    abstract public int Substraction(int a, int b);

}
class Derived extends Base //Error
{
    public int Substraction(int a, int b)
    {
        return a-b;
    }
    public int Multiplication(int a,int b)
    {
        return a*b;
    }

}

class AbstractDemo3
{
    public static void main(String A[])
    {
        Base bp = new Derived();  
        int iret = 0;

        iret = bp.Addition(11,10);
        System.out.println(iret);

        iret = bp.Substraction(11,10);
        System.out.println(iret);

        // iret = bp.Multiplication(11,10);  // Error

       
    }
}