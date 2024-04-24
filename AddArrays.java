import java.util.Arrays;

public class AddArrays {
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength + 1];

        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int num1 = 0;
            int num2 = 0;

            if(i < arr1.length) {
                num1 = arr1[arr1.length - 1 - i];
            }

            if(i < arr2.length) {
                num2 = arr2[arr2.length - 1 - i];
            }

            int sum = num1 + num2 + carry;
            result[result.length - 1 - i] = sum % 10;

            carry = sum / 10;
        }

        if (carry > 0) {
            result[0] = carry;
        } else {
            result = Arrays.copyOfRange(result, 1, result.length);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] arr2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};

       System.out.println(Arrays.toString(addArrays(arr1, arr2)));
    }
}
