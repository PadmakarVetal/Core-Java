import java.util.Scanner;
public class evenNumSum{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
 int sum=0;
for(int i=1;i<=10;i++)
if(i%2==0){
sum=sum+i;

}

System.out.println(""+sum);
return;
}
}