import java.util.Scanner;

public class distance{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
double x1,x2,y1,y2,distance;

System.out.println("Enter the x1 coordinates : ");
x1=sc.nextDouble();

System.out.println("Enter the y1 coordinates: ");
y1=sc.nextDouble();

System.out.println("Enter the x2 coordinates: ");
x2=sc.nextDouble();

System.out.println("Enter the y2 coordinates: ");
y2=sc.nextDouble();

distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

System.out.println("Distanc ebetween two points : "+distance);
}}