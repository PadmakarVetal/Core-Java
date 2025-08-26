import java.util.Scanner;
public class clock{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter Hours : ");
int a=sc.nextInt();

System.out.println("Enter Minutes : ");
int b=sc.nextInt();

System.out.println("Enter Seconds : ");
int c=sc.nextInt();

if((a>=0 && a<=24) && (b>=0 && b<=59) && (c>=0 && c<=59)){
System.out.println(+a+":"+b+":"+c+":"+"This time is valid");
} else {
System.out.println(+a+":"+b+":"+c+":"+"This time is Not Valid");

}



}
}