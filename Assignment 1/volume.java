import java.util.Scanner;
public class volume{
public static void main(String[] args){

Double r,h,Area,volume;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Radius: ");
r=sc.nextDouble();
System.out.println("Enter the Height: ");
h=sc.nextDouble();

Area=(2*3.14*(r*r)) + (2*3.14*r*h);
volume=3.14*(r*r)*h;

System.out.println("Area is : "+Area);
System.out.println("volume is : "+volume);
}
}