import java.util.Scanner;
public class sumXtoY{
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter x value: ");
int x=sc.nextInt();

System.out.println("Enter y value: ");
int y=sc.nextInt();
int sum=0;
if(x<y){
for(int i=x;i<=y;i++)
 sum=sum+i;
}
else {
for(int i=y;i<=x;i++)
sum=sum+i;
}
System.out.println("Sumis X to Y is : "+sum);
}
}

