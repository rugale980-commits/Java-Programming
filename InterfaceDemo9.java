
interface A {

    int no = 11;

    void fun();

    default void gun() {
        System.out.println("Inside gun");
        Display();
    }

    private void Display() // Helper function(Method) in we  use  only body 
    {
        System.out.println("Inside private Display");
    }
}

class Demo implements A {

    public void fun() {
        System.out.println("Inside fun");
    }
}

class InterfaceDemo9 {

    public static void main(String A[]) {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        // dobj.Display();  //Error
    }
}
