import java.util.*;
public class HashMapLinked  {
    public static void main(String[] args) {

// 创建 HashMap 对象，键类型为 String，值类型为 String
Map<String, String> map = new LinkedHashMap<>();

// 使用 put() 方法向 HashMap 中添加数据
map.put("chenmo", "沉默");
map.put("wanger", "王二");
map.put("chenqingyang", "陈清扬");

// 遍历 HashMap，输出所有键值对
for (Map.Entry<String, String> entry : map.entrySet()) {
    String key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
    }
}
// HashMap output sequence: Key: chenmo, Value: 沉默    Key: chenqingyang, Value: 陈清扬    Key: wanger, Value: 王二  with the random insertion order
//LinkedHashMap output sequence: Key: chenmo, Value: 沉默    Key: wanger, Value: 王二    Key: chenqingyang, Value: 陈清扬   following the insertion order


