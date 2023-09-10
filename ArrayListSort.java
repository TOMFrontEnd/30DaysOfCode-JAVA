import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class ArrayListSort {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    //for (String i : cars) {
      cars.forEach((i) -> System.out.println(i));
    }
  }

//综合体现了这个知识点，遍历，排序，插入。
//Linkedlist 用法和上述一致，但是添加了几个方法。加，消首尾
//add Lambda expression to literrate the item in sorted arrays.