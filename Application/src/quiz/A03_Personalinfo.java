package quiz;

public class A03_Personalinfo {
	public static void main(String[] args) {
		
		String name = "홍길동", tel1 = "010", blood = "O";
		byte age = 20, weight = 75;
	    short tel2 = 1234, tel3 = 1234;
	    double key = 178.5;
		
		System.out.println("===========출력 결과=============\n");
		System.out.println("이름\t:" + name);
		System.out.println("나이\t:" + age);
		System.out.println("Tel\t:" + tel1 + '-' + tel2 + '-' + tel3);
		System.out.println("키\t:" + key);
		System.out.println("몸무게\t:" + weight);
		System.out.println("혈액형\t:" + blood);
		
		
	}
}
