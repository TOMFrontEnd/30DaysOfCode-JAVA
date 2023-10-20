package JavaSchoolDemo.String;

public class TestIndexOf {
	public static void main(String args[]) {
		String Str = new String("菜鸟教程:www.51gjie.com");
		String SubStr1 = new String("runoob");
		String SubStr2 = new String("com");

		System.out.print("查找字符 o 第一次出现的位置 :" );
		System.out.println(Str.indexOf( 'o' ));
		System.out.print("从第14个位置查找字符 o 第一次出现的位置 :" );
		System.out.println(Str.indexOf( 'o', 14 ));
		System.out.print("子字符串 SubStr1 第一次出现的位置:" );
		System.out.println( Str.indexOf( SubStr1 ));
		System.out.print("从第十五个位置开始搜索子字符串 SubStr1 第一次出现的位置 :" );
		System.out.println( Str.indexOf( SubStr1, 15 ));
		System.out.print("子字符串 SubStr2 第一次出现的位置 :" );
		System.out.println(Str.indexOf( SubStr2 ));
	}
}