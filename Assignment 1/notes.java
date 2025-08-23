import java.util.Scanner;
public class notes{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int amount,N10,N5,N1;

System.out.println("Enter Amount: ");
amount=sc.nextInt();

N10=amount/10;
amount=amount%10;

N5=amount/5;
amount=amount%5;

N1=amount;

System.out.println("Total 10RS Notes needed: "+N10 + "\nTotal 5Rs Notes Needed: "+N5 +"\nTotal 1rs Note Needed: "+N1);
}
}