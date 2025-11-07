
class Base1
{

    public int i, j;

    // Defination
    void fun() {
        System.out.println("Inside the Base fun \n");
    }

    // Defination
    void gun() {
        System.out.println("Inside the Base gun \n");
    }

    // Defination
    void sun() {
        System.out.println("Inside the Base sun \n");
    }

    // Defination
    void bun() {
        System.out.println("Inside the Base bun \n");
    }
}

class Derived extends Base1 {

    public int x;

    // re-defination
    void gun() {
        System.out.println("Inside the Derived gun \n");
    }

    // overriding
    void sun() {
        System.out.println("Inside the Derived sun \n");
    }

    // Defination
    void run() {
        System.out.println("Inside the Derived run \n");
    }

    // Defination
    void mun() {
        System.out.println("Inside the Derived mun \n");
    }
}

public class Base {

    public static void main(String A[]) {
        Base1 bobj = new Base1(); // No Casting

        Derived dobj = new Derived(); // No Casting

        Base1 bdobj = new Derived(); // Up Casting

        //Derived dbobj = new Base1();//Down Casting(error)
        System.out.println("size of Base :\n" + bobj);
        System.out.println("size of Derived  :\n" + dobj);

        bdobj.fun(); // Inside the Base fun
        bdobj.gun(); // Inside the Base gun
        bdobj.sun(); // Inside the Derived sun
        // bdobj.run(); //error
        // bdobj.mun();//error
        bdobj.bun(); // Inside the Base bun

        // Downcasting to access Derived-specific methods
        if (bdobj instanceof Derived) {
            Derived dref = (Derived) bdobj;
            dref.run(); // Derived
            dref.mun(); // Derived
        }
    }
}
