package casting;

class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}
 
public class ExplicitDownCasting
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = (B) a;   //A type is explicitly downcasted to B type
        System.out.println(b.j);    //   Exception in thread "main" java.lang.ClassCastException: casting.A cannot be cast to casting.B

        C c = (C) a;   //A type is explicitly downcasted to C type
        D d = (D) a;   //A type is explicitly downcasted to D type
        B b1 = new B();
        D d1 = (D) b1;  //B type is explicitly downcasted to D type
        d1 = (D) new C();  //C type is explicitly downcasted to D type
    }
}