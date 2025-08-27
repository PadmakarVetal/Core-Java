import java.util.Scanner;
public class sum1toN{
public static void main(String [] args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter N: ");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum=sum+i;
}
System.out.println("Sum of first N number is: "+sum);
}
}

//Without loop

import java.util.Scanner;
public class sum1toN{
public static void main(String [] args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter N: ");
int n=sc.nextInt();

int sum=n*(n + 1)/2;

System.out.println("Sum of first N number is: "+sum);
}
}