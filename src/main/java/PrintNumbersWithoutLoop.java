//Print Numbers from 1 to N without using loop
public class PrintNumbersWithoutLoop {

    public void printNumbers(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            // Recursively call printNumbers
            printNumbers(n-1);
            // Print number while returning from recursion
            System.out.print(" "+n); // 1 2 3 4 5 6 7 8 9 10
        }
    }


    public static void main(String[] args) {
        PrintNumbersWithoutLoop pnwl=new PrintNumbersWithoutLoop();
        pnwl.printNumbers(10);

    }

}
