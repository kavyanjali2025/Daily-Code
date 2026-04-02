/*
 *      Comparision of three number number given by user using Scanner class
 * */

import java.util.*;

class Compare{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a first number: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second number: ");
                int b = sc.nextInt();
                System.out.print("Enter a Third number: ");
                int c = sc.nextInt();

                if (a == b && b == c) {
                        System.out.println("All numbers are equal");
                } else if (a >= b && a >= c) {
                        if (a == b) {
                                System.out.println("a and b are largest");
                        } else if (a == c) {
                                System.out.println("a and c are largest");
                        } else {
                                System.out.println("a is largest");
                        }
                } else if (b >= a && b >= c) {
                        if (b == c) {
                                System.out.println("b and c are largest");
                        } else {
                                System.out.println("b is largest");
                        }
                } else {
                        System.out.println("c is largest");

                }
        }
}

/*
 *Output With all test cases:
 *
        kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 10
Enter a Second number: 20
Enter a Third number: 30
c is largest
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 10
Enter a Second number: 60
Enter a Third number: 30
b is largest
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 50
Enter a Second number: 10
Enter a Third number: 30
a is largest
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 25
Enter a Second number: 25
Enter a Third number: 25
All numbers are equal
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 10
Enter a Second number: 10
Enter a Third number: 5
a and b are largest
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 10
Enter a Second number: 5
Enter a Third number: 10
a and c are largest
kishor@hp:~/java26/dailycodes/lec7$ java Compare
Enter a first number: 5
Enter a Second number: 10
Enter a Third number: 10
b and c are largest
kishor@hp:~/java26/dailycodes/lec7$
 * */