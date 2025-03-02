import java.util.Scanner;
class triangle  {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         if (a+b+c == 180) {
             System.out.println("We can form a triangle");
         }
         else
             System.out.println("we cannot form a triangle");
     }
}
