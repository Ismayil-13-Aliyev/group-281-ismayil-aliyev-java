package homework_14;

public class MathHelper {

	public static int square (int n) {
		return n * n;
	}
	
	public static boolean isEven (int n) { // ya le boolean vozvrash v cem problema????????????????????????
		if (n % 2 == 0) { 
			return true;
		} else {
			return false;
		}
	}
	
	 public static int max(int a, int b) {
		 return Math.max(a, b);
	 }
	
}
