import java.util.*;

class ExceptionDemo7
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
        System.out.println("Hello"); 
        catch(ArithmeticException aobj)   // Specific catch
        {
            System.out.println("Inside catch block ");
            System.out.println(aobj);
        }
        catch(Exception eobj)        // Generic catch
        {
            System.out.println("Inside Generic catch");
        }
        finally
        {
            System.out.println("Inside finally block");
        }
       
        System.out.println("division is : "+iAns);
   }
}