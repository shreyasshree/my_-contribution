# my_-contribution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String ans=&quot;&quot;;
if(n%2==1 || ( (n%2==0) &amp;&amp; (n&gt;=6 &amp;&amp; n &lt;= 20 ) ) )
{
ans = &quot;Weird&quot;;
}
else{
ans = &quot;Not Weird&quot;;
//Complete the code
}
System.out.println(ans);
}
}
