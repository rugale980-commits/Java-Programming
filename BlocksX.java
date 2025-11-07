class Demo
{
    public int i;                       // Instnce Variable
    static public int j;                // Class Variable

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    {
        System.out.println("Inside initializer block");
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }
}

class BlocksX
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}