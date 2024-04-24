import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        char k = sc.nextLine().charAt(0);

        int len = k - 64;

        for(int i = 1; i <= len; i++) {
            for(int j = len; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print((char)(64 + i));

            for(int j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }

            if(i == 1) {
                System.out.println();
            } else {
                System.out.println((char) (64 + i));
            }
        }

        for(int i = len - 1; i >= 1; i--) {
            for(int j = len; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print((char)(64 + i));

            for(int j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }

            if(i == 1) {
                System.out.println();
            } else {
                System.out.println((char)(64 + i));
            }
        }
    }
}