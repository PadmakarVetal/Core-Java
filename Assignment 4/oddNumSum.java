import java.util.Scanner;
public class oddNumSum{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("Sum of 1 to 10 Odd num is: ");
 int sum=0;
for(int i=1;i<=10;i++)
if(i%2!=0){
sum=sum+i;

}

System.out.println(""+sum);
return;
}
}