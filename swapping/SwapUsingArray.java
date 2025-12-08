public class SwapUsingArray {

    public static void main(String[] args) {

        int[] nums = { 4, 6 };

        System.out.println("Before swapping: " + " n = " + nums[0] + "| m = " + nums[1]);

        swaparray(nums);

        System.out.println("After swapping swapping: " + " n = " + nums[0] + "| m = " + nums[1]);
    }

    public static void swaparray(int[] arr) {

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }

}
