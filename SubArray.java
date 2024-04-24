public class SubArray {
    public static void main(String[] args) {
        int[] array1 = {-2, 7, 5, -1, -3, 2, 9, 7};
        int[] array2 = {-3, -1, 6, 1, -5, 1, 3, -8};

        printSubarray(array1);
        printSubarray(array2);
    }

    public static void printSubarray(int[] arr) {
        int sum = 0;
        int l = 0;

        int maxl = 0, maxr = 0;
        int maxSum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > maxSum) {
                maxl = l;
                maxr = i;
                maxSum = sum;
            }

            if(arr[i] < 0) {
                sum = 0;
                l = i;
            }
        }

        System.out.println("Sum: " + maxSum);
        for(int i = maxl + 1; i <= maxr; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
