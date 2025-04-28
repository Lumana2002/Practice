package Practice;
import java.util.Scanner;

class Fibonacci {
public static void main(String[] args) {
    int prev = 0;
    int curr = 1;
    int next;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a limit: ");
    int x = scanner.nextInt();
    
    System.out.println("The fibonacci series upto " + x);
    System.out.println(prev);
    System.out.println(curr);
    for(int i=2; i<x; i++){
        next = prev+curr;
        prev = curr;
        curr = next;
        System.out.println(next);
    }

}
    
}