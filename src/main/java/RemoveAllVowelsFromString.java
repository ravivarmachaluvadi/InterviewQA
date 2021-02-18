import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveAllVowelsFromString
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the string...");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
         
        System.out.println("The string without vowels...");
         
        System.out.println(newInputString);
         
        sc.close();
    }
}


//Without using replaceAll method:
 class RemoveAllVowelsFromStringA2
{
    public static void main(String[] args) {

        String str = "This is a test String";
        Set vowelsSet = new HashSet();
        vowelsSet.add('A');
        vowelsSet.add('E');
        vowelsSet.add('I');
        vowelsSet.add('O');
        vowelsSet.add('U');
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
        StringBuffer strBuff = new StringBuffer();

        char[] charArray = str.toCharArray();
        for(Character chr : charArray){
            if(!vowelsSet.contains(chr))
                strBuff.append(chr);
        }

        System.out.println("Original String is : " + str);
        System.out.println("Buffered String is : " + strBuff);

    }

}

