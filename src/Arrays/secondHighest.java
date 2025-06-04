package Arrays;

public class secondHighest {
    public static void main(String[] args) {
        int[] arr={1,5,2,3,7,7,6};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int max=arr[1];
        int second=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]>second && arr[i]!= max){
                second=arr[i];
            }
        }
        return second;
    }
}
