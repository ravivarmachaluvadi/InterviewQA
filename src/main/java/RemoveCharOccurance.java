public class RemoveCharOccurance {

    public static void main(String[] args) {
        String str1 = "abcdABCDabcdABCD";

        //replacing "aa" with "b" in the string "aaa" will result in "ba" rather than "ab"
        str1 = str1.replace("a", "");

        System.out.println(str1); // bcdABCDbcdABCD
    }
}
