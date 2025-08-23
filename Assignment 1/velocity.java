import java.util.Scanner;
public class velocity{
public static void main(String[] args){

int u,a,t,finalVelocity,Distance;

Scanner sc=new Scanner(System.in);
System.out.println("Enter initial Velocity: ");
u=sc.nextInt();
System.out.println("Enter acceleration: ");
a=sc.nextInt();
System.out.println("Enter time: ");
t=sc.nextInt();

finalVelocity=u+(a*t);
Distance=u+(a*(t*t));

System.out.println("Final Velocity is: "+finalVelocity);
System.out.println("Distance traveled is: "+Distance);
}}