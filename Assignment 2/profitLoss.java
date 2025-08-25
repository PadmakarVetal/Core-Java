import java.util.Scanner;

public class profitLoss{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Float profit,loss,cp,sp;
System.out.println("Enter the Cost price: ");
cp=sc.nextFloat();
System.out.println("Enter the Selling price: ");
sp=sc.nextFloat();

profit=sp-cp;
loss=sp-cp;

if(cp<sp){
System.out.println("Total profit is : "+profit);
}
else{
System.out.println("Total loss is : "+loss);
}
}}