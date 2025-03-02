import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b && a>c)
            System.out.println("A is largest");
        if(b>a && b>c)
            System.out.println("B is largest");
        if(c>a && c>b)
            System.out.println("C is largest");

    }
}
