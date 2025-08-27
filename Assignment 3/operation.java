import java.util.Scanner;
public class operation{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);

System.out.println("Enter x value: ");
int x=sc.nextInt();

System.out.println("Enter y value: ");
int y=sc.nextInt();

System.out.println("<---Choose Option--->\n1.Equality\n2.Less Then\n3.Quotient and Remender\n4.Range\n5.Swap");
int choice=sc.nextInt();

switch(choice){
case 1: if(x==y){
System.out.println("x and y is Equal");
} else {
System.out.println("x and y is Not Equal");
}
break;

case 2: if(x<y){
System.out.println("x is Less then y");
}
else {
System.out.println("y is Less then x ");
}
break;

case 3: 
    int remainder=x/y;
     int quotient=x%y;
System.out.println("Remainder is: "+remainder+"Quotient is"+quotient);

break;

case 4: if(x<y){
int range=y-x;
System.out.println("Range is between x and y is "+range);
} else {
int range=x-y;
System.out.println("Range between x and y "+range);

}
break;

case 5: 
      int temp=x;
      x=y;
       y= temp;
System.out.println("After Swap x is "+x+"\ny is"+y);
break;

default:
System.out.println("Enter Valid Option !!");


}
}
}




