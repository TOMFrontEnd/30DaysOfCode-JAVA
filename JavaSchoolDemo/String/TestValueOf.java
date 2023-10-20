package JavaSchoolDemo.String;

public class TestValueOf {
    public static void main(String args[]) {
    	double d = 1100.00;
        boolean b = true;
        long l = 1234567890;
        char[] arr = {'5', '1', 'g', 'j', 'i', 'e' };

        System.out.println("返回值 : " + String.valueOf(d) );
        System.out.println("返回值 : " + String.valueOf(b) );
        System.out.println("返回值 : " + String.valueOf(l) );
        System.out.println("返回值 : " + String.valueOf(arr) );
	}
}