import java.util.Scanner;
public class basicSalary{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the Basic Salary : ");
int basicSalary=sc.nextInt();

//double finalSalary;
if(basicSalary<=150000){
double finalSalary=basicSalary-(basicSalary*0);
System.out.println("After Tax Annul Salary is"+finalSalary);
}
 else if(basicSalary>=150000 && basicSalary<=300000){
double finalSalary=basicSalary-(basicSalary*0.2);
System.out.println("After Tax Annul Salary is"+finalSalary);
}
else if(basicSalary>=300000){
double finalSalary=basicSalary-(basicSalary*0.3);
System.out.println("After Tax Annul Salary is"+finalSalary);
}
else{
System.out.println("Invaild Salary Amount!!");
}



}
}