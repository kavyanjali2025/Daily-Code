/*
 *      Practice of  Scanner class
 *      in this code using scanner class give a employee details
 *
 *
 * */
import java.util.*;
class Employee{
        public static void main(String[] args){
                Scanner sc =  new Scanner(System.in);

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                float salary = sc.nextFloat();

                System.out.println("Employee Details: ");
                System.out.println("Employee Name: "+name);
                System.out.println("Employee Age: "+age);
                System.out.println("Employee Salary: "+salary);
        }
}
/*
Output:
Enter Employee Name: Kishor
Enter Employee Age: 20
Enter Employee Salary: 15000.00
Employee Details:
Employee Name: Kishor
Employee Age: 20
Employee Salary: 15000.0
*/