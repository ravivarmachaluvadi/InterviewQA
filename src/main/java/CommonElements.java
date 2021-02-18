import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args)
    {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
    }
}




class CommonElementsA2 {
    public static void main(String[] args)
    {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        HashSet<String> set1 = (HashSet<String>) Arrays.stream(s1).collect(Collectors.toSet());
        HashSet<String> set2 = (HashSet<String>) Arrays.stream(s2).collect(Collectors.toSet());
        HashSet<String> commonSet1 = new HashSet<String>();
        HashSet<String> commonSet2 = new HashSet<String>();

        set1.stream().filter(s -> set2.contains(s)).map(s -> commonSet1.add(s)).collect(Collectors.toSet()); //[FIVE, FOUR, THREE]

        set1.stream().filter(s -> set2.contains(s)).findFirst().ifPresent(s -> commonSet2.add(s));//[FIVE]

        System.out.println(commonSet1);
        System.out.println(commonSet2);


    }
}
