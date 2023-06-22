
import java.util.*; 
interface BillGen{ 
int calculate(); 
} 
class ProductB implements BillGen{ 
String name; 
int prod_id;
int quantity; 
int unit_price; 
int total; 
ProductB(){} 
ProductB(String n, int p, int q, int u){ 
name = n; 
prod_id = p; 
quantity = q; 
unit_price = u; 
} 
// to calculate total price of single product 
public int calculate(){ 
total = unit_price * quantity; 
return total; 
} 
} 
class Bill{ 
int n,m,b,c,d; 
public static void main(String[] args){ 
ProductB[][] order; 
Scanner sc = new Scanner (System.in);
System.out.println("enter no. of orders :"); 
int n = sc.nextInt(); 
order = new ProductB[n][]; 
for (int i = 0; i < n; i++){ 
System.out.print("\nenter no of products :"); 
int m = sc.nextInt(); 
order[i] =new ProductB[m]; 
for(int j = 0; j < m; j++){ 
System.out.print("\n\nenter product "+(j+1)+" name: "); 
String a = sc.next(); 
System.out.print("enter product id:"); 
int b = sc.nextInt(); 
System.out.print("enter product quantity:"); 
int c = sc.nextInt(); 
System.out.print("enter product unit price:"); 
int d = sc.nextInt(); 
ProductB pb = new ProductB(a,b,c,d); 
order [i][j] = pb; 
order [i][j].total = order[i][j].calculate(); 
} 
} 
String strFormat = "%-20s %-25s %-20s %-20s %-20s"; 
for(int i = 0; i < n; i++){ 
int sum = 0; 
System.out.println("\n\norder no:"+(i+1)); 
Date date = java.util.Calendar.getInstance().getTime(); 
System.out.println(date);
System.out.println("-------------------------------------------------------------------------------------------------"); 
System.out.printf(strFormat,"productId","Name","Quantity","unit price","Total"); 
System.out.println(); 
System.out.println("-------------------------------------------------------------------------------------------------"); 
for(int j=0;j<order[i].length;j++){ 
System.out.printf(strFormat,order[i][j].prod_id,order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total); 
System.out.println(); 
} 
System.out.println(""); 
for(int k=0;k<order[i].length;k++) 
sum=sum+order[i][k].total; 
System.out.println("-------------------------------------------------------------------------------------------------"); 
System.out.println("Net. Amount:"+sum); 
} 
} 
}
