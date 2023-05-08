package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class D05_Omok {
	
	/*
	 	오목을 만들어주세요
	 */
	// Hint - ㅂ누르고 한자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean overlap = false;
		boolean win = false;
		boolean fault = false;
		int[][] tmp = new int[7][10];
		int count = 0;
		int count2 = 0;
		// Hint - 판 그리는 방법
//		for(int i = 0; i < 10; ++i) {
//			for (int j = 0; j < 10; ++j)
//			System.out.println("┼");
//		}
		System.out.println();
		// Hint - 돌 놓는 방법
		char[][] omok = {
				{'┌', '┬', '┬', '┬', '┬', '┬', '┬','┬','┬','┐'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼','┼','┼','┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼','┼','┼','┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼','┼','┼','┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼','┼','┼','┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼','┼','┼','┤'},
				{'└', '┴', '┴', '┴', '┴', '┴', '┴','┴','┴','┘'}
		};
		for (int i = 0; i < omok.length; ++i) {
			for (int j = 0; j < omok[i].length; ++j) {
				System.out.printf("%c", omok[i][j]);
			}
			System.out.println();	
		}
		while(true) {
			System.out.println("흑의 차례입니다");
			System.out.println("좌표를 선택하세요");
			int num = sc.nextInt();
			if(num < 0 || num >= 70) {
				fault = true;
				while(fault) {
					System.out.println("잘못된 값입니다 다시 입력해주새요");
					num = sc.nextInt();
					if(num >= 0 && num < 70) {
						fault = false;
						if(omok[num / 10][num % 10] == '●' || omok[num / 10][num % 10] == '○') {
							overlap = true;
							while(overlap) {
								System.out.println("이미 돌이 놓여진 위치입니다 다른 좌표를 선택하세요");
								num = sc.nextInt();
								if(omok[num / 10][num % 10] != '●' && omok[num / 10][num % 10] != '○') {
									overlap = false;
								}
							}
						}
						omok[num / 10][num % 10] = '●';
						for (int i = 0; i < omok.length; ++i) {
							for (int j = 0; j < omok[i].length; ++j) {
								System.out.printf("%c", omok[i][j]);
							}	
							System.out.println();	
						}
					}
				}
			}else if(num >= 0 && num < 70) {
				if(omok[num / 10][num % 10] == '●' || omok[num / 10][num % 10] == '○') {
					overlap = true;
					while(overlap) {
						System.out.println("이미 돌이 놓여진 위치입니다 다른 좌표를 선택하세요");
						num = sc.nextInt();
						if(omok[num / 10][num % 10] != '●' && omok[num / 10][num % 10] != '○') {
							overlap = false;
						}
					}
				}
				omok[num / 10][num % 10] = '●';
				for (int i = 0; i < omok.length; ++i) {
					for (int j = 0; j < omok[i].length; ++j) {
						System.out.printf("%c", omok[i][j]);
					}	
					System.out.println();	
				}
				if(num >= 0 && num < 70) {
					for(int i = 0; i < omok.length; ++i) {
						for(int j = 0; j < omok[0].length; ++j) {
							tmp[count2][count] = num;
						}	
					}
					//System.out.println(Arrays.deepToString(tmp));
					for(int i = 0; i < omok.length; ++i) {
						for(int j = 0; j < omok[0].length; ++j) {
							
						}
					if(num/10 < 3) {
						if(omok[num/10][num%10] == '●' && omok[num/10 +1][num%10] == '●'
					&& omok[num/10 +2][num%10] == '●' && omok[num/10 +3][num%10] == '●'
					&& omok[num/10 +4][num%10] == '●') {
						System.out.println("흑의 승리입니다");
						win = true;
						}	
					}
					if(num/10 < 3 && num%10 < 6) {
						if(omok[num/10][num%10] == '●' && omok[num/10 +1][num%10 +1] == '●'
						&& omok[num/10 +2][num%10 +2] == '●'
						&& omok[num/10 +3][num%10 +3] == '●'
						&& omok[num/10 +4][num%10 +4] == '●'){
						System.out.println("흑의 승리입니다");
						win = true;
					}									
					}
					if(num%10 < 6) {
						if(omok[num/10][num%10] == '●' && omok[num/10][num%10 +1] == '●'
						&& omok[num/10][num%10 +2] == '●' && omok[num/10][num%10 +3] == '●'
						&& omok[num/10][num%10 +4] == '●') {
						System.out.println("흑의 승리입니다");
						win = true;
						}
					}					
					if(num/10 > 3 && num%10 > 5) {
						if(omok[num/10][num%10] == '●' && omok[num/10 -1][num%10 -1] == '●'
								&& omok[num/10 -2][num%10 -2] == '●' && omok[num/10 -3][num%10 -3] == '●'
								&& omok[num/10 -4][num%10 -4] == '●') {
								System.out.println("흑의 승리입니다");
								win = true;
								}
					}
					++count;
					if(count == 10) {
						++count2;
						count = 0;
					}
				}
			if(win) {
				break;
			}
			}
			System.out.println("백의 차례입니다");
			System.out.println("좌표를 선택하세요");
			num = sc.nextInt();
			if(num < 0 || num >= 70) {
				fault = true;
				while(fault) {
					System.out.println("잘못된 값입니다 다시 입력해주새요");
					num = sc.nextInt();
					if(num >= 0 && num < 70) {
						fault = false;
						if(omok[num / 10][num % 10] == '●' || omok[num / 10][num % 10] == '○') {
							overlap = true;
							while(overlap) {
								System.out.println("이미 돌이 놓여진 위치입니다 다른 좌표를 선택하세요");
								num = sc.nextInt();
								if(omok[num / 10][num % 10] != '●' && omok[num / 10][num % 10] != '○') {
									overlap = false;
								}
							}
						}
						omok[num / 10][num % 10] = '○';
						for (int i = 0; i < omok.length; ++i) {
							for (int j = 0; j < omok[i].length; ++j) {
								System.out.printf("%c", omok[i][j]);
							}
							System.out.println();	
						}
					}
				}
			}else if(num >= 0 && num < 70) {
				if(omok[num / 10][num % 10] == '●' || omok[num / 10][num % 10] == '○') {
					overlap = true;
					while(overlap) {
						System.out.println("이미 돌이 놓여진 위치입니다 다른 좌표를 선택하세요");
						num = sc.nextInt();
						if(omok[num / 10][num % 10] != '●' && omok[num / 10][num % 10] != '○') {
							overlap = false;
						}
					}
				}
				omok[num / 10][num % 10] = '○';
				for (int i = 0; i < omok.length; ++i) {
					for (int j = 0; j < omok[i].length; ++j) {
						System.out.printf("%c", omok[i][j]);
					}
					System.out.println();	
				}
				if(num >= 0 && num < 70) {
					if(num/10 < 3) {
						if(omok[num/10][num%10] == '○' && omok[num/10 +1][num%10] == '○'
					&& omok[num/10 +2][num%10] == '○' && omok[num/10 +3][num%10] == '○'
					&& omok[num/10 +4][num%10] == '○') {
						System.out.println("백의 승리입니다");
						win = true;
						}	
					}
					if(num%10 < 3 && num/10 <6) {
						if(omok[num/10][num%10] == '○' && omok[num/10 +1][num%10 +1] == '○'
						&& omok[num/10 +2][num%10 +2] == '○'
						&& omok[num/10 +3][num%10 +3] == '○'
						&& omok[num/10 +4][num%10 +4] == '○'){
						System.out.println("백의 승리입니다");
						win = true;
						}
					}
					if(num%10 < 6) {
						if(omok[num/10][num%10] == '○' && omok[num/10][num%10 +1] == '○'
						&& omok[num/10][num%10 +2] == '○' && omok[num/10][num%10 +3] == '○'
						&& omok[num/10][num%10 +4] == '○') {
						System.out.println("백의 승리입니다");
						win = true;
						}
					}
					if(num/10 > 3 && num%10 > 5) {
						if(omok[num/10][num%10] == '○' && omok[num/10 -1][num%10 -1] == '○'
								&& omok[num/10 -2][num%10 -2] == '○' && omok[num/10 -3][num%10 -3] == '○'
								&& omok[num/10 -4][num%10 -4] == '○') {
								System.out.println("백의 승리입니다");
								win = true;
								}
					}
				}				
			}
			if(win) {
				break;
			}	
		}	
	}
}
}

