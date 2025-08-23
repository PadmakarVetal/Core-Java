import java.util.Scanner;

public class surfaceArea{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int l,b,h,surfaceArea,volume;

System.out.println("Enter Length: ");
l=sc.nextInt();
System.out.println("Enter Breadth: ");
b=sc.nextInt();
System.out.println("Enter Height: ");
h=sc.nextInt();

surfaceArea=2*(l*b+l*h+b*h);
volume=l*b*h;

System.out.println("Surface area is: "+surfaceArea);
System.out.println("volume is: "+volume);
}
}