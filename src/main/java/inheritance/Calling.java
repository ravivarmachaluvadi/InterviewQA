
package inheritance;

public class Calling {
    public static void main(String[] args) {
        m1(12);
        Calling calling= new Calling();
        //calling.s1(null); // compile time error: reference to s1 is ambiguous

        final StringBuilder sb=new StringBuilder("Ravi");
        sb.append(" Varma");
        System.out.println(sb); //Ravi Varma

    }

    static void m1(int i){
        System.out.println(" i "+ i); // will be invoked
    }

    static void m1(long j){
        System.out.println(" j "+ j);
    }

     void s1(String s){
        System.out.println(" String : "+s);
    }

     void s1(StringBuffer s){
        System.out.println(" StringBuffer : "+s);
    }
}
