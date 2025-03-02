import java.util.Scanner;
 class grade {
     public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         System.out.println("Enter the grade");
         int a = in.nextInt();
         if(a >= 90) {
             System.out.println("Grade is A");
         } else if (a >= 80) {
             System.out.println("Grade is B");
         }
         else if (a>=60) {
             System.out.println("Grade is C");
         }
         else if (a>=35){
             System.out.println("Grade is D");

         } else if (a<35) {
             System.out.println("Fail");
         }


         }

     }


