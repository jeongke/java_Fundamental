package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//java.lang.NumberFormatException =>
		//aaaa1 => 예외처리를 해야함
		//12.34 => 코드를 변경해야함.
		int i =Integer.parseInt("11111"); //aaaa1
		System.out.println(i);
		
		//java.lang.NumberFormatException
		double d  = Double.parseDouble("12.34");//12.34a
		System.out.println(d);
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어나면 발생하는 예외
		int[] a = {1,2,3,4};
		System.out.println(a[3]); //a[4]
		
		
		//java.lang.IndexOutOfBoundsException
		//Collection에서 범위를 벗어나면 발생하는 예외
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);//auto-boxing
		System.out.println(list.get(0));//get(1)
		
		//java.lang.NullPointerException
		//객체를 생성하지 않고 메서드를 사용하면 발생하는 예외
		String str = "hello"; //null;
		System.out.println(str.length()); //
		
		
		//java.lang.ArithmeticException
		int b = 10;
		int c = 0;
		System.out.println(b/c);
		
		
	
	
	}
	
}