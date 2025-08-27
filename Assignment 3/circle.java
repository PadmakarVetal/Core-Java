import java.util.Scanner;
public class circle{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Redius: ");
int r=sc.nextInt();

System.out.println("<---Choose Option--->\n1.Area of Circle\n2.Circumference of Circle\n3.Volume of Sphere");
int count=sc.nextInt();

switch(count){

case 1:
	double areaOfCircle=3.14*(r*r);
System.out.println("Area of Circle is: "+areaOfCircle);
break;

case 2:
     double circumference=2*3.14*r;
System.out.println("Circumference of circle is:"+circumference);
break;

case 3:
 	double volume=4/3*(3.14*r*r*r);
System.out.println("Volume of Sphere is :"+volume);

break;
default: 
System.out.println("Enter Valid Option");

}
}
}

