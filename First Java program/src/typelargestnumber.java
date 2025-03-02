import java.util.Scanner;

public class typelargestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        long num1 = in.nextLong();
        long num2 = in.nextLong();
        if(num1 > num2)
            System.out.println("largest num is" + " " + num1);
        else
            System.out.println("largest num is" + " " + num2);


    }
}
