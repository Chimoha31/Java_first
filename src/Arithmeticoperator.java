
public class Arithmeticoperator {
	public static void main(String[] args) {
		
		short shortNum = 12;
		int result;
		
		result = shortNum / 3;
		System.out.println("Result: " + result);
		
		int i = 2 + 1;
		System.out.println(i);
		
		String s = "2" + "1";
		System.out.println(s);
		
		int z = 12 + 1;
		z = 12 - 1;
		z = 12 * 2;
		z = 12 / 2;
		System.out.println(z);
		
		int mod = 13 % 2;
		System.out.println(mod);
		
		int mod1 = (int)12.5 % 2;
		System.out.println(mod1);
		
		int increment = 10;
		System.out.println("prefix: " + ++increment);
		System.out.println("postfix: " + increment++);
		
		System.out.println(- 23 - 3);
		
//		Paranthses
//		((4 + 3) + (2+ 7))) //inbalanced
//
//		int x = 2 * (a - b);
//		
//		int x = 25 - value;
		
		
	}

}
