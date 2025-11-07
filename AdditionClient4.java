import java.util.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class AdditionClient4
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running...");


        Socket sobj = new Socket("Localhost",2100);
        System.out.println("Server Successfully connected ");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        
        Scanner scobj = new Scanner(System.in);
        int no1 = 0 , no2 = 0;

        System.out.println("Enter the first number :");
        no1 = scobj.nextInt();

        System.out.println("Enter the second number :");
        no2 = scobj.nextInt();

        doobj.writeInt(no1);
        doobj.writeInt(no2);



        int sum = diobj.readInt();
        System.out.println("Addition is : "+sum);

        sobj.close();

        System.out.println("Client Application terminated..");
    }
}