import java.util.Scanner;
public class cheakPositive{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int a;

System.out.println("Enter the Number");
a=sc.nextInt();

if(a<0){

System.out.println("Given Number is Not Positive");
}
else{

System.out.println("Given Number is Positive");
}
}
}