import java.lang.*;

class Demo 
{
    public int division(int no1, int no2) throws ArithmeticException
    {
        int Ans = 0;
        Ans = no1 / no2;
        return 0;
    }
}

class Throwsdemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        int ret = 0;
        try
        {
            ret = dobj.division(11,0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch"+aobj);
        }

        System.out.println("Division is : "+ret);
    }
}
