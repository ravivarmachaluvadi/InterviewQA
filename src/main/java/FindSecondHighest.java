public class FindSecondHighest {

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};

        System.out.println(findSecondHighest(arr));
    }

}
