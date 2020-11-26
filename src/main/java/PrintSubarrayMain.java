
//Print all subarrays of a given array
public class PrintSubarrayMain {

    void printSubArray(int arr[])
    {

        int n=arr.length;
        for (int i=0; i <n; i++) //This loop will select start element
        {
            for (int j=i; j<n; j++)   //This loop will select end element
            {
                for (int k=i; k<=j; k++) //This loop will print element from start to end

                {
                    System.out.print( arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]){
        PrintSubarrayMain psm=new PrintSubarrayMain();
        int arr[]= {1,2,3,4};
        psm.printSubArray(arr);
    }
}
