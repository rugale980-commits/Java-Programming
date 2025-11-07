class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main Method");

        String name = Thread.currentThread().getName();

        System.out.println("Name of current is thread is : "+name);
    }
}