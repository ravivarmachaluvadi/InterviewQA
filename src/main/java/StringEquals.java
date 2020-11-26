/*Explanation: The given statements output will be “false” because in java + operator precedence is more than == operator.
        So the given expression will be evaluated to “s1 == s2 is:abc” == “abc” i.e false.*/




public class StringEquals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2); //false
        System.out.println(s1 == s2);//true
    }
}

