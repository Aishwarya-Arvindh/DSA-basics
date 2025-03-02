import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        n=0;
        long fibb = long (n-1) + (n-2);
        System.out.println("The fibbocci series is " + " " + fibb);
    }
}
