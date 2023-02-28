public class Mainn {
    public static void main(String[] args) {
        int[] nums = {6, 18, 22, 33,41};
        int index = findNearestNeighbors(nums);
        System.out.println("Index of the first number: " + index);
    }
    public static int findNearestNeighbors(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i-1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i-1;
            }
        }
        return index;
    }

}
