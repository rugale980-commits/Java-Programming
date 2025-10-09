import java.util.*;

class ExceptionDemo4
{
   public static void main(String A[])
   {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0; 

        System.out.println("Enter the first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iNo2 = sobj.nextInt();
        try
        {
            System.out.println("Inside try block ");
            iAns = iNo1 / iNo1;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch block ");
            System.out.println(aobj);
        }

        System.out.println("division is : "+iAns);
   }
}