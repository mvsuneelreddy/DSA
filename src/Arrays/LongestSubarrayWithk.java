package Arrays;

public class LongestSubarrayWithk {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,1,1,1,2,1};
        System.out.println(ans(arr,4));
    }

    private static int ans(int[] arr,int k) {
        int max=0;
        int sum=0;
        int j=0;
        int length=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            if(sum ==k){
                length=i-j+1;
                max=Math.max(length,max);
            }
            else if (sum>k){
                sum=sum-arr[j];
                j++;
            }
        }
        return max;
    }
}
