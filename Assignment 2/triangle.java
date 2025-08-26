import java.util.Scanner;
public class triangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter First Side Length: ");
int a=sc.nextInt();
System.out.println("Enter Second Side Lenght: ");
int b=sc.nextInt();
System.out.println("Enter Third side Length: ");
int c=sc.nextInt();


if((a+b>c) && (b+c>a) && (c+a>b)){
System.out.println("Triangle is Valid");
} else {
System.out.println("Triangle is not Valid");
}
}
}