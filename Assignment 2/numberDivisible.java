import java.util.Scanner;
public class numberDivisible{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a;
System.out.println("Enter the Number you want cheak Divisible with 5 or 7: ");
a=sc.nextInt();
if(a%5==0 && a%7==0){
System.out.println("Given number is Divisible with 5 and 7");
}
else if(a%5==0){
System.out.println("Given Number is Divisible with only 5");
}
else if(a%7==0){
System.out.println("Give number is Divisible with only 7");
}
else {
System.out.println("Given Number is not Divisible with 5 and 7 both");
}
}}