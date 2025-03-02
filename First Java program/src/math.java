import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = input.nextInt();
        if (num1 % 2 == 0)
            System.out.println("number is even");
        else System.out.println("number is odd");


    }
}