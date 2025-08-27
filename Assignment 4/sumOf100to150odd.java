import java.util.Scanner;
public class sumOf100to150odd{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("Sum of 100 to 200 odd number is: ");

 int sum=0;
for(int i=100;i<=200;i++)
if(i%2!=0){
sum=sum+i;

}

System.out.println(""+sum);
return;
}
}