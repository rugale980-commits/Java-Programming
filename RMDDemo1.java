class Base
{
    public int i,j;

}

class Derived extends Base
{
    public int x;
}

class RMDDemo1
{
    public static void main(String A[])
    {
        Base bp1 = new Base();           //No Casting
        Derived dp2 = new Derived();     //No Casting
        Base bp2 = new Derived();        //UpCasting
        Derived dp2 = new Base();        //DownCasting  //Error

    }
}