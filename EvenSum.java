package Practice;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number limit: ");
        int num = scanner.nextInt();

        int sum = 0;
        
        for(int i = 1; i<=num; i++){
            if(i%2 == 0){
                sum +=i;
                // System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
