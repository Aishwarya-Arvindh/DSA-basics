import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println( "Enter the value of P,T and R");
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        int interest = (P*T*R)/100;
        System.out.println("The Simple interest is " +" "+ interest);

    }
}
