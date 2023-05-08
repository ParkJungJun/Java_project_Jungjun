package myobj;

import java.util.Arrays;

public class School {
	String[] studentNumber = new String [100];
	String[] student = new String[100];
	int[] totalReport = new int[6];
	int[] programmingClass = new int[7];
	String[] programmingClass2 = new String[100];
	int[] wetworkClass = new int[5];
	int[] machineLearningClass = new int[6];
	String[] lastName = {"박","이","김","손","변","최","정","강","조","윤","장","임"};
	String[] FirstnName = {"정준","종현","영준","혁준","로아","영민","종현","흥민","강인","민재","철수","길동"};
	String[] name = new String[100];
	String[] class1 = {"programmingClass","wetworkClass","machineLearningClass"};
	String[] studentClass;
	int totalScoer;
	int count = 0;

	public School() {
		
		for (int i = 0; i < studentNumber.length; ++i) {
			studentNumber[i] = "STU" + i;
		}
//		for(int i = 0; i < programmingClass.length; ++i) {
//			programmingClass[i] = (int)(Math.random() * 100 + 1);
//		}
		for(int i = 0; i < wetworkClass.length; ++i) {
			wetworkClass[i] = (int)(Math.random() * 100 + 1);
		}
		for(int i = 0; i < machineLearningClass.length; ++i) {
			machineLearningClass[i] = (int)(Math.random() * 100 +1);
		}
		for(int i = 0; i <name.length; ++i) {
			name[i] = lastName[(int)(Math.random() * 12)]
					+ FirstnName[(int)(Math.random() * 12)];
		}
//		for(int i = 0; i < programmingClass2.length; ++i) {
//			
//			for(int j = 0; j < programmingClass.length; ++j) {			
//				//programmingClass2[i] = programmingClass;
//				programmingClass2[i][j] = (int)(Math.random() * 100 + 1);
//			}
//		}
	}
	
	public String totalinfo() {
		for(int i = 0; i < 100; ++i) {
			student[i] = studentNumber[i] + " " +name[i] + " ";
		}
		return Arrays.toString(student);
	}
	
//	public String programmingClassInfo() {
//		return Arrays.toString(programmingClass);
//	}
	public String wetworkClassInfo() {
		return Arrays.toString(wetworkClass);
	}
	public String machineLearningClassInfo() {
		return Arrays.toString(machineLearningClass);
	}
	public String studentNumberInfo() {
		return Arrays.toString(studentNumber);
	}
	public String nameInfo() {
		return Arrays.toString(name);
	}
	public void info() {
		for(int i = 0; i < programmingClass2.length; ++i) {
			for(int j = 0; j < programmingClass.length; ++j) {
				programmingClass[j] = (int)(Math.random() * 100 + 1);
				programmingClass2[i] += programmingClass[j] + " ";
				//System.out.print(programmingClass[j] + " ");
				++count;
				
//				if(count % 7 == 0) {
//					System.out.println();
//				}
			}
			//System.out.println(programmingClass2[i]);
		}
		System.out.println(Arrays.toString(programmingClass2));
	}
//	public String studentClassInfo() {
//		return Arrays.deepToString(programmingClass2);
//	}
}
