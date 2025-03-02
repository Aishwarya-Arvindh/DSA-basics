import java.util.Scanner;
 class size {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the input");
         int S = in.nextInt();
         switch (S) {
             case 30:
                 System.out.println("Size is Medium");
                 break;
             case 48:
                 System.out.println("Size is Large");
                 break;
             case 42:
                 System.out.println("Size is XL Large");
                 break;
             default:
                 System.out.println("Invalid Input");


         }
     }
 }
