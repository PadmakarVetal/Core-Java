import java.util.Scanner;
public class library{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter total Days you carry book: ");
int a=sc.nextInt();

if(a<5 && a>0){
System.out.println("Total fine is Rs 10");
} else if(a>5 && a<11){
System.out.println("Total fine is Rs 20");
}
else if(a>10){
System.out.println("Total Fine is Rs 30");
}
else{
System.out.println("Enter Valid Days");
}
}
}