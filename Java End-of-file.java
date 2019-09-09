# my_-contribution
public class Solution {

    public static void main(String[] args) {
        check(1);  // call check method
    }

    static void check(int count) {          
        Scanner s = new Scanner(System.in);
        if(s.hasNext() == true) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
            check(count);
        }
    } 
}
