package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,3,3,5,6};
        System.out.println(Arrays.toString(rmdup(arr)));
    }
    public static int[] rmdup(int[] arr){
        int j=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]==arr[j]){

            }
            else
            {
                arr[j+1]=arr[i];
                j++;
            }
        }
        return arr;
    }
}
