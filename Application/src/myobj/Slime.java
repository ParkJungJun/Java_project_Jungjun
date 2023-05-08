package myobj;

public class Slime {
	public String slimeName;
	public static int slime_Max_HP = 100;
	public int slime_HP = 100;
	public int attack;
	
//	public static int slime_Defult_AD = 5;
//	public static int goblin_HP = 300;
//	public static int goblin_AD = 10;
	public boolean slime_Damaged_HP = slime_HP < slime_Max_HP;
	public Slime(String slimeName,int attack) {
		this.slimeName = slimeName;
		this.attack = attack;
	}
	public void damaged(){
		if(slime_HP <= 0) {
			System.out.printf("%s는 죽었습니다\n",slimeName);
		}else if(attack > 0) {
			slime_HP -= attack;
			System.out.printf("%s는 %d만큼 피해를 받았습니다\n",slimeName,attack);
			System.out.printf("%s는 남은 체력이 %d가 되었습니다!\n",slimeName,slime_HP);
			if(slime_HP <= 0) {
				System.out.printf("%s는 죽었습니다\n",slimeName);
			}
		}
	}
}
