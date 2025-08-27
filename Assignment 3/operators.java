import java.util.Scanner;
public class operators{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);

System.out.println("Enter Num1 : ");
int num1=sc.nextInt();

System.out.println("Enter Num2 : ");
int num2=sc.nextInt();

System.out.println("<--Choise Operator-->\n1.+\n2.-\n3.*\n4./");
int operator=sc.nextInt();

switch(operator){
   
case 1: 
     int sum=num1+num2;
     System.out.println("Sum is : "+sum);
break;

case 2: 
     int substraction=num1-num2;
          System.out.println("Substraction is : "+substraction);
break;

case 3: 
     int multiplication=num1*num2;
     System.out.println("Multiplication is : "+multiplication);
break;

case 4: if(num2!=0 && num1!=0){
     int division=num1/num2;
     System.out.println("Divisition is : "+division);
}
else {
     System.out.println("Answer is Infinity !!");

}
break;
default:
 
     System.out.println("Enter Valid Number");
 break;
}
}
}
     





