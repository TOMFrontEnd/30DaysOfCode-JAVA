public class StaticDemo {
   private static int numInstances = 0;
   // only usedd by class itself, static means its still wont be changed due to object changed

   private static int getCount() {
      return numInstances;
   }
 //proteced means this and its subclass could use too, static means its independable to object could use straitway
   private static void addInstance() {
      numInstances++;
   }
 // void no return value.
   StaticDemo() {
      StaticDemo.addInstance();
   }
 //create method of itself
 //构造器
   public static void main(String[] arguments) {
      System.out.println("Starting with " +
      StaticDemo.getCount() + " instances");
      for (int i = 0; i < 500; ++i){
         new StaticDemo();
          }
      System.out.println("Created " +
      StaticDemo.getCount() + " instances");
   }
}