import java.util.Scanner;
public class Greatest
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("\n---------------Numbers Science--------------------\n");
System.out.println(" Enter First Number :");
int x = sc.nextInt();
System.out.println(" Enter Second Number :");
int y = sc.nextInt();
System.out.println(" Enter Third Number :");
int z = sc.nextInt();

if(x<y && y<z)
{
System.out.print("\n Increasing Order \n");
}
else if(x>y && y>z)
{
System.out.print("\n Dereasing Order \n");
}
else
{
System.out.print("\n Neither Increasing Order or Dereasing Order \n ");
}
}
}
