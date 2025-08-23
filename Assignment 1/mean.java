import java.util.Scanner;
public class mean{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
Float AM,HM,a,b;

System.out.println("Enter First Number: ");
a=sc.nextFloat();
System.out.println("Enter Second Number: ");
b=sc.nextFloat();

AM=(a+b)/2;
HM=a*b/(a+b);

System.out.println("Arethmatic Meam is : "+AM);
System.out.println("Harmonic Mean : "+HM);
}}