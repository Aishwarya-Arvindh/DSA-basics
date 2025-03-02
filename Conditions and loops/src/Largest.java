import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // find largest of 3 number
        int max = a;
        if(b>max) {
            max= b;
        }
        if (c>max) {
            max=c;
        }
        System.out.println(max);

    }


}

/*Write a program to print N numbers starting from 2. Take N as input and print from 2 to N;

Input Format

6

Constraints

3<=N<=10^3

Output Format

2 3 4 5 6*/


/*Write a program which takes a value N and prints the sum of N natural numbers. Natural numbers start from 1.

Explanation: Sum of natural numbers from 1 to N, here N is 5, so 1+2+3+4+5 is 15. Input N = 5; Expected output : 15

Input Format

5

Constraints

1<= N <= 10^2

Output Format

15*/
