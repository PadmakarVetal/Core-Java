import java.util.Scanner;

public class Temperature{
public static void main(String[] args){

Double f,celsius,kelvin;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Temperature in Fahrenheit: ");
f=sc.nextDouble();

celsius=(5/9)*f-32;
kelvin=celsius+273.15;

System.out.println("temperature in celsius: "+celsius);
System.out.println("temperature in kelvin : "+kelvin);
}
}