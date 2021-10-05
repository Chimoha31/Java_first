
public class MakingDecision {

	public static void main(String[] args) {
		int x = 4;
//		if(x == 5) {
//			System.out.println("Value of x is 5");
//		}else {
//			System.out.println("Value of x is not 5");
//		}
//		
		if(x != 5) {
			System.out.println("Value of x is 5");
		}else {
			System.out.println("Value of x is not 5");
		}

		int y = 6, z = 7;
		if(4 < 5) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		if(y >= z) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1 && bool2) {
			System.out.println("condition is true!");
		}else {
			System.out.println("condition is false!");
		}
		
		
		boolean m = true;
		boolean n = false;
		
		if(m || n) {
			System.out.println("condition is true!");
		}else {
			System.out.println("condition is false!");
		}
		
		
//		if..elseif
		int b = 5;
		if(b == 5) {
			System.out.println("b is equals to 5");
		}else if(b > 5) {
			System.out.println("b is greater than 5");
		}else {
			System.out.println("b is smaller than 5");
		}
		
		
//		Ternary operator
		boolean a = true;
		
		a = (10 == 5) ? true : false;
		System.out.println(a);
		
	}

}
