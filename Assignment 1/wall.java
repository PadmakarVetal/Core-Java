import java.util.Scanner;
public class wall{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
Double door,windowArea,l,b,h,totalWallArea,roofArea,doorArea,totalAreaForPaintForWall,twoWindowArea;

System.out.println("Enter the room length (l): ");
l=sc.nextDouble();

System.out.println("Enter the room Breadth (b): ");
b=sc.nextDouble();

System.out.println("Enter the room Height (h): ");
h=sc.nextDouble();

totalWallArea=2*(l*b)*h;
roofArea=l*b;

System.out.println("Enter the window length(l): ");
l=sc.nextDouble();

System.out.println("Enter the window breadth(b): ");
b=sc.nextDouble();

windowArea=l*b;
twoWindowArea=windowArea*2;

System.out.println("Enter the door length(l): ");
l=sc.nextDouble();

System.out.println("Enter the door breadth(b): ");
b=sc.nextDouble();

doorArea=l*b;

totalAreaForPaintForWall=totalWallArea-twoWindowArea-doorArea;

System.out.println("Total Area for Paint wall is:"+totalAreaForPaintForWall +"\nRoof Area for white paint is: "+roofArea);
}
}





