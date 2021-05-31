package sabre;

import java.util.ArrayList;
import java.util.List;

public class SabreMain {

    public static void main(String[] args) {

        Customer customer= new Customer("Ravi");
        Customer customer1= new Customer("Varma");

        List list=new ArrayList();

        list.add(customer);
        list.add(customer1);

        Temparature temp=new Temparature(2,list);

        temp.setTemp(1);
        temp.setTemp(12);
        temp.setTemp(20);

        Greetings greetingsInstance=n -> System.out.println("Hello World " + n);

        greet(greetingsInstance, "Tom");
    }

    private static void greet(Greetings greetingsInstance, String name) {

        greetingsInstance.sayHello(name);
    }

}
