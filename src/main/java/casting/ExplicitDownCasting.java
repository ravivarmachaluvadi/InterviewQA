package casting;

import java.util.HashSet;
import java.util.Set;

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
        D d= new D();
        System.out.println(d.i); // 10
        System.out.println(d.j); // 20
        System.out.println(d.k); // 30
        System.out.println(d.m); // 40

        Set set = new HashSet();

        set.add("Ravi");
    }
}