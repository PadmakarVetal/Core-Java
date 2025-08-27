import java.util.Scanner;
public class XtoY{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter X value: ");
int x=sc.nextInt();

System.out.println("Enter y value: ");
int y=sc.nextInt();

if(x<=y){
for(int i=x;i<=y;i++)
System.out.println(""+i);
} else {
for(int i=x;i>=y;i--)
System.out.println(""+i);
}
}}

