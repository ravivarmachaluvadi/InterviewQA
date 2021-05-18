package inheritance;

class A
{
    int i;
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    A()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    static
    {
        System.out.println("Class B SIB");
    }

    {
        System.out.println("Class B IIB");
    }

    B()
    {
        super();
        System.out.println("Class B Constructor");
    }

    int j;
}
 
class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();

       /*
        Class A SIB
        Class B SIB
        Class A IIB
        Class A Constructor
        Class B IIB
        Class B Constructor
        */

        new B();

        /*
        Class A SIB
        Class B SIB
        Class A IIB
        Class A Constructor
        Class B IIB
        Class B Constructor
        */
    }
}