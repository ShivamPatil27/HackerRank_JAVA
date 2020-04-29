import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
public static PerformOperation isOdd(){
    return n ->{
        if(n%2!=0)
        return true;
        return false;
    };
}
public static PerformOperation isPrime(){
    return n->{
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0)
                return false;
            }
        }
        return true;
    };
}
public static PerformOperation isPalindrome(){
    return n ->{
        String d = Integer.toString(n);
        String d1 = new StringBuilder(d).reverse().toString();
        return d.equals(d1);
    };
}
}
public class Lambda_exp {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
