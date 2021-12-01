package theory;

class A
{
    void m2()
    {
        System.out.println("Class A method m2");
        m1();
    }

    void m1()
    {
        System.out.println("Class A method m1");
    }
}
 
class B extends A
{
    void m1()
    {
        System.out.println("Class B method m1");
    }
}
 
class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();

        a.m2();
        /*
        Class A method m2
        Class B method m1 //dynamic overloading
         */

        A a1 = (A)new B();

        a1.m1(); //Class B method m1
        a.m1();  //Class B method m1

    }
}
