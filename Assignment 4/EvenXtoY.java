import java.util.Scanner;
public class EvenXtoY{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter x value: ");
int x=sc.nextInt();

System.out.println("Enter y value: ");
int y=sc.nextInt();

System.out.println("Even Number are "+x+" to "+y+" is : \n");


if(x<=y){
 
for(int i=x;i<=y;i++)
if(i%2==0){

System.out.println(""+i);

}
} else {

for(int i=x;i>=y;i--)
  if(i%2==0){
System.out.println(""+i);
}
}

}
}


