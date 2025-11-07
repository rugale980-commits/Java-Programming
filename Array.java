public class Array
 {
    public static void main(String A[])
     {
        int array [] = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;
       
        System.out.println("Array elements:"+array.length);
        
        for (int icnt = 0; icnt <array.length; icnt++)
        {
            System.out.println(array[icnt]);

        }
    }
}
