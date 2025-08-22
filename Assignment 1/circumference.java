import java.util.Scanner;
public class circumference{
public static void main(String[] args){

double r,Area,circumference;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius : ");
r=sc.nextDouble();

Area=3.14*r*r;
circumference=2*3.14*r;

System.out.println("Area is:  "+Area);
System.out.println("Circumference is:  "+circumference);
}
}
