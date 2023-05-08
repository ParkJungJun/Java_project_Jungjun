package myobj;

public class FishBread {
	public static int FishBread_QTY = 100;
	public String FishBread_taste;
	public String FishBread_tasteP;
	public String FishBread_tasteS;
	public String FishBread_tasteC;
	public int FishBread_price;
	
	public FishBread(String FishBread_taste) {
		if(FishBread_taste.equals(FishBread_tasteP)) {
			FishBread_price = 800;
		}else if(FishBread_taste.equals(FishBread_tasteS)) {
			FishBread_price = 1000;
		}else {
			FishBread_price = 1200;
		}
	}
}
