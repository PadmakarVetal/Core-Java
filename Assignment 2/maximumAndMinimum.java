import java.util.Scanner;
public class maximumAndMinimum{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter First Number: ");
int a=sc.nextInt();

System.out.println("Enter Second Number: ");
int b=sc.nextInt();

System.out.println("Enter Third Number: ");
int c=sc.nextInt();
int max;
if(a>b && a>c){
   max=a;
} else if(b>a && b>c){
   max=b;
} else {
  max=c;
}
System.out.println("Here Maximum Number is "+max);

int min;
if(a<b && a<c){
   min=a;
} else if(b<a && b<c){
   min=b;
} else {
  min=c;
}
System.out.println("Here Minimum Number is "+min);
}
}