// public class StringBuilderDemo {
//     public static void main(String[] args) {
//         String[] names= {"Bob", "Alice", "John", "Mary"};
//         StringBuilder sb = new StringBuilder();
//         sb.append("Hello ");
//         for (String name : names) {
//             sb.append(name).append(",");
//         }
// sb.delete(sb.length()-1, sb.length()).append("!");
//         System.out.println(sb.toString());
//     }
// }
// 第二种办法实现， 用StringJoiner类
// import java.util.StringJoiner;
// public class StringBuilderDemo {
//     public static void main(String[] args) {
//         String[] names= {"Bob", "Alice", "John", "Mary"};
//         StringJoiner sj = new StringJoiner(",","Hello2 ","!");
//         for (String name : names) {
//             sj.add(name);
//         }
//         System.out.println(sj.toString());
//     }
// }
// 另外一种更简单，就是直接使用join() 但是不能指定开头和结尾
 public class StringBuilderDemo {
    public static void main(String[] args) {
String[] names = {"bob", "Alice" , " Grace"};
String s = String.join(",",names);
System.out.println(s);
 }
}