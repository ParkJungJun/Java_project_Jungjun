package quiz;

public class B10_WhileGugudanT {
	public static void main(String[] args) {
		
		int dan = 2;
		
		while (dan <= 9) {
			System.out.printf("%d단: ", dan);
			int gop = 1;
			while (gop <= 9) {
				System.out.printf("%dx%d= %-2d ", dan ,gop, dan * gop);
				++gop;
			}
			System.out.println();
			++dan;
		}
		
		int gop = 1;
		int line = 0;
		while (line <= 10) {
			dan = 2;
			while (dan <= 9) {
				if (line == 0) {
					System.out.printf("%d단\t\t", dan);
				}else {
					System.out.printf("%d x %d = %d\t", dan, line , dan * line);
				}
				++dan;
			}
			System.out.println();
			++line;
		}
	}
}
