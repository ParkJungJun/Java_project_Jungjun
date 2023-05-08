package Blackjack;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand = new ArrayList<>();
	private int money = 2500;
	
	public void plusMoney(int money) {
		this.money += money;
	}
	
	public void minusMoney(int money) {
		this.money -= money;
	}
	
	public int getMoney() {
		return money;
	}
	
	/**플레이어에게 카드를 추가한다*/
	public void addCard(Card card){
		hand.add(card);
	}
	
	public void printCards() {
		for (Card card : hand) {
			System.out.print(card + " ");
		}
		System.out.printf("(%d)\n", getValue());
	}
	
	/**플레이어가 현재 가진 카드들로 점수를 계산하여 리턴*/
	public int getValue() {
		int value = 0;
		int a_count = 0;
		for(Card card : hand) {
			value += card.getRankValue();
			//A의 개수를 센다
			if(card.getrank() == 0)
				++a_count;
		}
		//21점이 넘으면 가지고 있던 A들을 1로 변경
		while(value > 21 && a_count-- > 0) {
			value -= 10; //11을 1로 변경
		}
		return value;
	}
	public void reset() {
		while (hand.size() != 0) {
			hand.remove(0);
		}
	}
	/** 들고 있는 카드 중 해당 번째 카드를 뒤집은 상태로 변경된다*/
	public void reverse(int index) {
		if(hand.size() <= index || index <0) {
			System.out.println("없는 카드입니다");
			return;
		}
		hand.get(index).reverse();
	}
	public void printcardswithNoValue() {
		for(Card card : hand) {
			System.out.print(card + " ");
		}
		System.out.println();
	}
}
