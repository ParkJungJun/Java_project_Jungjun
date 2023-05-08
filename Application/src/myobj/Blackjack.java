package myobj;

import java.util.ArrayList;
import java.util.Arrays;

public class Blackjack {
	public ArrayList dealer = new ArrayList();
	public ArrayList player = new ArrayList();
	String[] cardDeck ={"A♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","J♠","Q♠","K♠",
	         "A♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","J♥","Q♥","K♥",
	         "A♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","J♣","Q♣","K♣",
	         "A◆","2◆","3◆","4◆","5◆","6◆","7◆","8◆","9◆","10◆","J◆","Q◆","K◆"};
	public ArrayList cardDeck2 = new ArrayList();
	String dealertmp;

	
	public ArrayList startPlayer() {
		
		for(int i = 0; i < 2; ++i) {
			player.add(cardDeck[(int)(Math.random() * cardDeck.length)]);
			//dealer[i] = cardDeck[(int)(Math.random() * cardDeck.length)];
		}
		//System.out.println("플레이어: " + Arrays.toString(player));
		//System.out.println("딜러: " + Arrays.toString(dealer));
		return player;
	}
	
	void Blackjack() {
		this.player = player;
		this.dealer = dealer;
	}
	
	public ArrayList startDealer() {
		
		for(int i = 0; i < 2; ++i) {
			//player[i] = cardDeck[(int)(Math.random() * cardDeck.length)];
			dealer.add(cardDeck[(int)(Math.random() * cardDeck.length)]);
		}
		dealertmp = (String) dealer.get(1);
		dealer.add(1,"XX");
		dealer.remove(2);
		//System.out.println("플레이어: " + Arrays.toString(player));
		
		return dealer;
	}

	public ArrayList hit() {
		player.add(cardDeck[(int)(Math.random() * cardDeck.length)]);
		return player;
	}
	public ArrayList dealerHit() {
		dealer.remove(1);
		dealer.add(dealertmp);
		dealer.add(cardDeck[(int)(Math.random() * cardDeck.length)]);
		return dealer;
	}
	public int sum() {
		cardDeck2.add(cardDeck);
		return 0;
	}
}
