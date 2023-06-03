import java.util.*;
public class Deques
{
public static void main(String[]args)
{
Deque<String>deque=new ArrayDeque<String>();
deque.add("1");
deque.add("2");
deque.add("3");
deque.add("4");
deque.add("5");
System.out.println("Elements in deque are : ");
for(String str:deque)
{
System.out.println(str +"");
}
deque.remove();
System.out.println("After first element deleted :");
for(String str:deque)
{
System.out.println(str +"");
}
deque.clear();
System.out.println("After all element deleted :\n");
for(String str:deque)
{
System.out.println(str +"");
}
}
}
