package mandatory;

import java.util.HashMap;
import java.util.Map;

public class MandatoryP1 {
    public static void main(String[] args) {

        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};

        int arrS[] = { 12, 11, 13, 5, 6, 7 };

        Map map= new HashMap<>();

        int maxCount= Integer.MIN_VALUE;
        int maxElement= Integer.MIN_VALUE;

        for(int i : arr){

            if(map.containsKey(i)){
                int count = (int)map.get(i);
                count=count+1;
                map.put(i,count);

                if(maxCount<count){
                    maxCount=count;
                    maxElement=i;
                }
            }
            else
            map.put(i,1);
        }
        //System.out.println(maxCount);
        System.out.println(map);
        System.out.println(maxElement+" : "+maxCount);

        int i = searchEle(arr, 0, arr.length-1, 8);

        System.out.println("index : "+i);

        sort(arrS,0,arrS.length-1);

        System.out.println(arrS);


    }

    static int searchEle(int[] arr,int start,int last, int elemenet){

        if(last>=start) {
            int mid = (start +(last-1)) / 2;

            if (arr[mid] == elemenet) {
                return mid;

            }  if (arr[mid] < elemenet) {
               return searchEle(arr, mid + 1, last, elemenet);
            } else {
                return searchEle(arr, start, mid-1, elemenet);
            }
        }
            return -1;
    }

    static void sort(int arr[] , int start, int last){
        if(start<last){
            int mid= (start+(last-1))/2;

            sort(arr,start,mid);
            sort(arr,mid+1,last);

            merge(arr,start,mid,last);

        }
    }

    private static void merge(int arr[], int start, int mid, int last) {

        int n1= mid-start+1;
        int n2= last-mid;

        int[] left= new int[n1];
        int[] right= new int[n2];

        for (int i = 0; i < n1; ++i) {
            left[i]=arr[1+i];
        }
        for (int j = 0; j < n2; ++j)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = last;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
