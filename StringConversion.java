import java.util.*;
class StringConversion
{
public static void main (String args[])
{
HashMap <String,String>aa=new HashMap<String,String>();
Scanner sc=new Scanner(System.in);
aa.put(sc.next(),sc.next());
aa.put(sc.next(),sc.next());
if(aa.containsKey("a")&&aa.containsKey("b"))
aa.put("a",aa.get("b"));
System.out.println(aa);
}
}
