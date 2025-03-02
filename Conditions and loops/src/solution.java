/*
Write a program which takes the following input and prints them one by one. 1. An whole number 2. A letter 3. A number with fractional part 4. A word

Input Format

34 S 56.1 PowerRanger

Constraints

2 ≤ whole numer ≤ 10^6

Output Format

34
S
56.1
PowerRanger

Sample Input 0

34
S
56.7
Str
Sample Output 0

34
S
56.7
Str

*/
import java.util.Scanner;
public class solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int wholenumber = input.nextInt();


        String letter = input.next();
        char character = letter.charAt(0);


        double fractionalNumber = input.nextDouble();


        String word = input.next();


        System.out.println( wholenumber);
        System.out.println( character);
        System.out.println( fractionalNumber);
        System.out.println( word);

        input.close();




        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}