class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default constructor");
    }
    public Demo (int i, int j)
    {
        System.out.println("Inside paramertrised constructor");
    }
}

class Constructor 
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();
        
        Demo dobj2 = new Demo(11,21);

    
    }
}