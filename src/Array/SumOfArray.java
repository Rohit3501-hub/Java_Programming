package Array;


public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 6, 10};
        int target = 10;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(left + "" +right);
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
    }
}


