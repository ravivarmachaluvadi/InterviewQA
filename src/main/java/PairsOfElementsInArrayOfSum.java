import java.util.Arrays;

public class PairsOfElementsInArrayOfSum {
    static void findThePairs(int inputArray[], int inputNumber)
    {
        //Sorting the given array
        Arrays.sort(inputArray);
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
        //Initializing i to first index
        int i = 0;
        //Initializing j to last index
        int j = inputArray.length-1;
        //Till i crosses j, perform the following task
        while (i < j)
        {
            //If inputArray[i]+inputArray[j] is equal to inputNumber
            if(inputArray[i]+inputArray[j] == inputNumber)
            {
                //then Print inputArray[i] and inputArray[j]
                System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                //Increment i
                i++;
                //Decrement j
                j--;
            }
            //If inputArray[i]+inputArray[j] is smaller than inputNumber
            else if (inputArray[i]+inputArray[j] < inputNumber)
            {
                //then increment i
                i++;
            }
            //If inputArray[i]+inputArray[j] is greater than inputNumber
            else if (inputArray[i]+inputArray[j] > inputNumber)
            {
                //then decrement j
                j--;
            }
        }
    }

    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
    }
}



class PairsOfElementsInArrayBruteForce
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");

        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
}




