import java.util.Scanner;
public class marks{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("<--Enter subject Marks -->");
System.out.println("Physics: ");
int p=sc.nextInt();

System.out.println("Chemistry: ");
int c=sc.nextInt();

System.out.println("Math's : ");
int m=sc.nextInt();

int totalMarks=c+m+p;
float averageMarks=totalMarks/3;

System.out.println("Total Marks:"+totalMarks);
System.out.println("Average Marks:"+averageMarks+"%");


if(averageMarks>=80){
System.out.println("Grade is Class I :");
} else if(averageMarks>=60){
System.out.println("Grade is Class II :");
} else if(averageMarks>=35 && averageMarks<=60){
System.out.println("Your Are Pass :");
}
else{
System.out.println("You Are Failed :");
}


}}