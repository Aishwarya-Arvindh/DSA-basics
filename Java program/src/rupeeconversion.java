import java.util.Scanner;
public class rupeeconversion {
    public static void main(String[] args) {

        System.out.println("Enter the currency in inr");
        Scanner r = new Scanner(System.in);
        double rupees = r.nextLong();
        double dollars =rupees * 0.012;
        System.out.println("The currency in dollars is" +" " + dollars);




    }
}
