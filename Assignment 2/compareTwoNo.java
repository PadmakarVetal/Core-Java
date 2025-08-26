import java.util.Scanner;
public class compareTwoNo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter First Number: ");
float a=sc.nextFloat();
System.out.println("Enter Second Number: ");
float b=sc.nextFloat();

if(a==b){
  System.out.println("Both Number are Equal !!");
}
else if(a<b){
System.out.println(+b+"this number is greater then"+a);
}
else {
System.out.println(+a+"this number is greater then"+b);
}

}
}