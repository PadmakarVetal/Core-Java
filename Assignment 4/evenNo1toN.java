import java.util.Scanner;
public class evenNo1toN{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.print("Enter a number for cheak even number between 1 to n: ");
int n=sc.nextInt();
System.out.println("Even number are betwwen 1 to"+n+"is: ");
if(n%2==0){
for(int i=1;i<=n;i++)
System.out.println(""+i);
}
return;
}
}