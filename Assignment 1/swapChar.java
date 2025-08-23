import java.util.Scanner;
public class swapChar{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
char ch,previous,next;

System.out.println("Enter the Characto: ");
ch=input.nextChar().charAt(0);

previous = (char)(ch - 1);
next = (char)(ch + 1);

System.out.println("previous char: "+previous);
System.out.println("next Char: "+next);
}
}