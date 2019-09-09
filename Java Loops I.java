# my_-contribution
import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print
output to STDOUT. Your class should be named Solution. */
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
sc.close();
for(int i = 1; i &lt;= 10; i++){
int answer = input*i;
System.out.println(input + &quot; x &quot; + i + &quot; = &quot; + answer);
}
}
}
