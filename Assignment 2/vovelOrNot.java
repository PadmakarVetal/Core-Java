import java.util.Scanner;
public class vovelOrNot{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char ch;

System.out.println("Enter Any charactor: ");
ch=sc.next().charAt(0);

if(ch>='a' && ch<='z')
{
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
 {	
System.out.println("Given CHaractor is vowel !!");
 } else 
  {
System.out.println("Given Number is Consonant");
  } 
}
else {
System.out.println("Invalid Charactor !! ");

}
}
}