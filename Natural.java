package Practice;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
