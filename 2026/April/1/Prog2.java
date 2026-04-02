/*
 *      Addition of two number number given by user
 * */

import java.util.*;

class Addition{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter a Second number: ");
                int num2 = sc.nextInt();

                System.out.print("Addition of two numbers: "+(num1+num2));
                System.out.println();
        }
}
/*
 *Output:
Enter a first number: 5
Enter a Second number: 6
Addition of two numbers: 11
 */