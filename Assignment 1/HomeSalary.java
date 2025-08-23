import java.util.Scanner;
 
public class HomeSalary{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
Double houseRent,dearnessAllowence,tax,salary,homeSalary;

System.out.println("Enter total Salary: ");
salary=sc.nextDouble();

houseRent=salary*0.1;
dearnessAllowence=salary*0.3;
tax=salary*0.05;

homeSalary=houseRent+dearnessAllowence+tax+salary;

System.out.println("home Salary is : "+homeSalary);
}
}

