package Practice;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=num ; i++){
            if(i%2==0){
                continue;
            }
            else{
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
