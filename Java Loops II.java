# my_-contribution
import java.util.*;
import java.io.*;
import java.lang.Math.*;
class Solution{
public static void main(String []argh){
Scanner in = new Scanner(System.in);
int t=in.nextInt();
for(int i=0;i&lt;t;i++){
int a = in.nextInt();
int b = in.nextInt();
int n = in.nextInt();
int calc = a;
for(int j=0;j&lt;n;j++)
{
calc+=(Math.pow(2,j)*b);
System.out.print(calc+&quot; &quot;);
}
System.out.println();
}

in.close();
}
}
