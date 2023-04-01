import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
System.out.println("enter number of rows");
Scanner c=new Scanner(System.in);
int m=c.nextInt();
System.out.println("enter number of colums");
int n=c.nextInt();
int[][] arr1=new int[m][n];
int[][] arr2=new int[m][n];
int[][] sumr=new int[m][n];
int i,j;
System.out.println("enter elements in first matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr1[i][j]=c.nextInt();
}}
System.out.println("enter elements in second matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr2[i][j]=c.nextInt();
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
sumr[i][j]=arr1[i][j]+arr2[i][j];
}}
System.out.println("matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(sumr[i][j]+" ");
}
System.out.print("\n");
}}
}
