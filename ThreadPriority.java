class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main Method");

        Thread tobj = Thread.currentThread();
        String name = tobj.getName();

        System.out.println("Name of current is thread is : "+name);

        int Priority = tobj.getPriority();
        System.out.println("Priority of current thread is : "+tobj.getPriority()); // 5
        tobj.setPriority(10);

        Priority = tobj.getPriority();
        System.out.println("Priority of current thread is : "+tobj.getPriority()); // 5
    }
}