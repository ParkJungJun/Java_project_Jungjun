package defult_package;

public class C11_ModifierTest {
	
	public static String s1 = "ABC";
	protected static String s2 = "ABC";
	static String s3 = "ABC";
	private static String s4 = "ABC";
	
	public static int ml1() {
		return 10;
	}
	public static int ml2() {
		return 10;
	}
	public static int ml3() {
		return 10;
	}
	public static int ml4() {
		return 10;
	}
	
	public int i1 = 10; 		// public	
	protected int i2 = 20;		// protected
	int i3 = 30;				// default
	private int i4 = 40;		// private
	
	public int m1() {
		return 10;
	}
	protected double m2() {
		return 1.1;
	}
	boolean m3() {
		return true;
	}
	
	private int[] m4() {
		return new int[10];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
