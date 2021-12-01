package sabre;

public class SabreMain {

    public static void main(String[] args) {

        //implementation
        Greetings greetingsInstance= n -> System.out.println("Hello World " + n);

        //invocation
        greetingsInstance.sayHello("Ravi");


        greet(greetingsInstance, "Tom");
    }

    private static void greet(Greetings greetingsInstance, String name) {
        greetingsInstance.sayHello(name);
    }

}

@FunctionalInterface
interface Greetings {

    void sayHello(String name);

}
