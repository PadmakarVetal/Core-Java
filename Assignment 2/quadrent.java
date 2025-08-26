import java.util.Scanner;
public class quadrent{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter x coordinate: ");
int x=sc.nextInt();
System.out.println("Enter y coordinate: ");
int y=sc.nextInt();

if(x==y){
System.out.println("Co-ordinate on Origin !!");
} else if(x>0 && y<0){
System.out.println("Co-ordinate on First Quadrant !!");
} else if(x<0 && y>0){
System.out.println("Co-ordinate on Secound Quadrant !!");
} else if(x<0 && y<0){
System.out.println("Co-ordinate on Third Quadrant !!");
} else if(x>0 && y<0){
System.out.println("Co-ordinate on Forth Quadrant !!");
} else if(x==0){
System.out.println("Co-ordinate on Y-axis !!");
}else {
System.out.println("Co-ordinate on X-axis !!");
}



}}