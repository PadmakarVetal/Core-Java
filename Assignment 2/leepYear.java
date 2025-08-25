import java.util.Scanner;
	public class leepYear{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a;

System.out.println("Enter any year: ");
a=sc.nextInt();
if((a%4==0 && a%100==0) ||(a%400 !=0)){
System.out.println("The given year is Leap Year");
}
else {
 System.out.println("The given year not Leap Year");

}
}
}


