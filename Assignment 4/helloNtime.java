import java.util.Scanner;
public class helloNtime{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("How much time you want to print Hello World");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
System.out.println("Hello World");
}
}