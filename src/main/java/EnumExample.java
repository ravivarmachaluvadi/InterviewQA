public class EnumExample {

    public static void main(String[] args) {
        System.out.println(ThreadStates.DEAD); //DEAD

        System.out.println(ThreadStates.RUNNING.name().equalsIgnoreCase("Running")); //true

        System.out.println(ThreadStates.RUNNING.name().equals("Running")); //false

        System.out.println(ThreadStates.WAITING.name()=="Waiting"); //false

        System.out.println(ThreadStates.WAITING.name()=="WAITING"); //true

    }
}

 enum ThreadStates {
    START,
    RUNNING,
    WAITING,
    DEAD;
}