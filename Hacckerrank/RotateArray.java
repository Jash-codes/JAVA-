import java.util.Arrays;

public class RotateArray {

    public static void solution(int[] nums, int k) {
        // ---------------------------------------------------
        // TODO: WRITE YOUR LOGIC HERE
        // Goal: Rotate the array 'nums' to the right by 'k' steps.
        // Note: Try to modify 'nums' directly (in-place).
        // ---------------------------------------------------
        
    }

    // =======================================================
    // DRIVER CODE (Do not edit below this line)
    // This simulates the HackerRank environment
    // =======================================================
    public static void main(String[] args) {
        // Test Cases: (Input Array, k, Expected Output)
        int[][] inputArrays = {
            {1, 2, 3, 4, 5, 6, 7},
            {-1, -100, 3, 99},
            {1, 2},
            {1},
            {1, 2, 3}
        };
        
        int[] kValues = {3, 2, 3, 0, 6};
        
        int[][] expectedOutputs = {
            {5, 6, 7, 1, 2, 3, 4},
            {3, 99, -1, -100},
            {2, 1},
            {1},
            {1, 2, 3}
        };

        System.out.println("========================================");
        System.out.println("              TEST RESULTS              ");
        System.out.println("========================================");

        boolean passedAll = true;

        for (int i = 0; i < inputArrays.length; i++) {
            // Create a copy of the input so we don't mess up the original test data
            int[] currentInput = Arrays.copyOf(inputArrays[i], inputArrays[i].length);
            int k = kValues[i];
            int[] expected = expectedOutputs[i];

            try {
                // Call user logic
                solution(currentInput, k);

                // Check result
                if (Arrays.equals(currentInput, expected)) {
                    System.out.println("Test Case " + (i + 1) + ": ✅ PASSED");
                } else {
                    System.out.println("Test Case " + (i + 1) + ": ❌ FAILED");
                    System.out.println("   Input:    " + Arrays.toString(inputArrays[i]) + ", k=" + k);
                    System.out.println("   Expected: " + Arrays.toString(expected));
                    System.out.println("   Got:      " + Arrays.toString(currentInput));
                    passedAll = false;
                }
            } catch (Exception e) {
                System.out.println("Test Case " + (i + 1) + ": ⚠️ ERROR");
                System.out.println("   Exception: " + e.getMessage());
                e.printStackTrace();
                passedAll = false;
            }
        }

        System.out.println("========================================");
        if (passedAll) {
            System.out.println("🎉 All test cases passed! Great job.");
        } else {
            System.out.println("Keep trying! Check the logic above.");
        }
    }
}