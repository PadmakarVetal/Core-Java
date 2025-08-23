import java.util.Scanner;
public class interchange{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int a,b,Temp;

System.out.println("Enter First Number(a): ");
a=sc.nextInt();
System.out.println("Enter Second Number(b): ");
b=sc.nextInt();
// temperaturery 
Temp=a;
a=b;
b=Temp;
System.out.println("After swaping a= "+a + "b is= "+b);

System.out.println("Enter First Number(a): ");
a=sc.nextInt();
System.out.println("Enter Second Number(b): ");
b=sc.nextInt();

//Using + and-
a=a+b;
b=a-b;
a=a-b;
System.out.println("after Number swap a=" + a + "b is ="+b);

 System.out.println("Enter First Number(a): ");
a=sc.nextInt();
System.out.println("Enter Second Number(b): ");
b=sc.nextInt();

//using * and 
a=a*b;
b=a/b;
a=a/b;
System.out.println("After Number Swap a= "+a + "b ="+b);
}
}
