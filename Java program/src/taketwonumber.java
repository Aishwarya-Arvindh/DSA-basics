import java.util.Scanner;

public class taketwonumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number and the operator");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operator = input.next().charAt(0);
        if (operator == '+')
            System.out.println(num1 + num2);
        else if (operator == '-')
            System.out.println(num1 - num2);
        else if (operator == '*')
            System.out.println(num1 * num2);
        else if (operator == '/')
            System.out.println(num1 / num2);

    }
}
