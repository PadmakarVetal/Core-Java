import java.util.Scanner;
public class DivisibleWithOr{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a;
System.out.println("Enter the Number you want cheak Divisible with 5 or 7: ");
a=sc.nextInt();
if(a%5==0 || a%7==0){
System.out.println("Given number is Divisible ");
}
else {
System.out.println("Given Number is not Divisible");
}
}}