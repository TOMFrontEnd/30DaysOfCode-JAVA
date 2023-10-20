import java.util.*;
// import java.lang.*;
public class StackDemo1 {
    public static void main(String[] args) {
        String hex=toHex(12500);
if (hex.equalsIgnoreCase("30D4")){
    System.out.println("test success");
} else {
    System.out.println("test failed");
}
    }
    
    static String toHex(int n) {
        Deque<String> deque = new LinkedList<>();
        int z;
        String popedString="" ;
        double c;
        c=n/16;
        z=(int)Math.floor(c);
        String y=Integer.toHexString(n%16);
        while (true) {
            deque.push(y);
            if (z==0) break;
            y=Integer.toHexString(z%16);
        z=(int)Math.floor(z/16);
        // if (z=0) break;// y=z%16;
    } 
     while (! deque.isEmpty()){
        // String popedString="";
       popedString +=deque.pop();
            }
            System.out.println(popedString);
       return popedString; 
}
}