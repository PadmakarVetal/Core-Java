import java.util.Scanner;
public class discount{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Quantity and Rate for First Item: ");
int q1=sc.nextInt();
float r1=sc.nextFloat();

System.out.println("Enter the Quantity and Rate for Second Item: ");
int q2=sc.nextInt();
float r2=sc.nextFloat();

System.out.println("Enter the Quantity and Rate Third Item : ");
int q3=sc.nextInt();
float r3=sc.nextFloat();

float totalSaleAmount=(q1*r1)+(q2*r2)+(q3*r3);
double discountAmount=0;
if(totalSaleAmount<=1000){
double discountAmount=totalSaleAmount*0.08;
System.out.println("Total Sale amount is :"+totalSaleAmount);
System.out.println("Final Discount is :"+discountAmount);


} 
else if(totalSaleAmount>=1000 && totalSaleAmount<=3000){
double discountAmount=totalSaleAmount*0.15;
System.out.println("Total Sale amount is :"+totalSaleAmount);
System.out.println("Final Discount is :"+discountAmount);
}
else{
double discountAmount=totalSaleAmount*0.20;
System.out.println("Total Sale amount is :"+totalSaleAmount);
System.out.println("Final Discount is :"+discountAmount);

}
double finalAmount=totalSaleAmount-discountAmount;
System.out.println("Final Discount amount For pay is :"+finalAmount);
}
}

