package JavaSchoolDemo.Integer;

public class IntegerValueOfDemo {
    public static void main(String[] args) {
        
        System.out.println(Integer.valueOf("123")==Integer.valueOf("123")); // true
        System.out.println(Integer.valueOf("128")==Integer.valueOf("128"));// false
        System.out.println(Integer.parseInt("128")==Integer.valueOf("128"));//true  
// -128-127 diffrent, they are stored in ram memory. so first they compare the same one;
// the sedond one is different., as 128 is bigger than 127, so its two Integer are comparing.  their value Integer.equals is same, but reference is different.. 
//parseInt is back to int, == is comparing the value. they are same.
    Integer i01=new Integer(59);
    int i02=59;
Integer i03 = Integer.valueOf(59);
Integer i04 = new Integer(59);
System.out.println(i01==i02);
System.out.println(i01==i03);
System.out.println(i03==i04);
System.out.println(i02==i04);



    }
    
}
