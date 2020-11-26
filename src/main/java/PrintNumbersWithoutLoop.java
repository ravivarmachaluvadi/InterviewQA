//Print Numbers from 1 to N without using loop
public class PrintNumbersWithoutLoop {

    public static void main(String[] args) {
        PrintNumbersWithoutLoop pnwl=new PrintNumbersWithoutLoop();
        pnwl.printNumbers(10);

    }

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
            System.out.print(" "+n);
        }
    }

}
