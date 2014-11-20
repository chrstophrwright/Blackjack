// Deck of Cards Project

import java.util.*;

public Deck{
	private static String[] suits = ["Clubs","Diamonds","Hearts","Spades"] ;
	private static int[] amounts = [1,2,3,4,5,6,7,8,9,10,11,12,13];
	public static ArrayList<Card> deck = new ArrayList<Card>[52]();
	public static int deckSize = 52;

	public void makeDeck(){
		int i = 0
		for (int j=0; j<4; j++){
			for (int k=0; k<13; k++){
				deck[i] = new Card(suits[j], amounts[k])
				i++;
			}
		}
	}

	public void discard(int card){
		this.remove(card);
		this.deckSize --;
	}

	public Card dealCards(){
		System.out.print(this.get(0));
		discard(0);
	}

	public void shuffleDeck(){
		for (int i=0; i<deck.deckSize; i++){}
	}

	public card[] dealManyCards(int num){
		ArrayList <Card> = 
		while (num){
			dealCards();
			num--;
		}

	public string 

	}

	public HandOfCards extends Deck(){
		public static ArrayList <Card> hand;
		public static int handSize;

		Hand(){
			hand = new ArrayList<Card>();
			handSize = 0;
		}

		public void addToHand(Card card){
			hand.add(card);
		}
	
		public randomDiscardFromHand(){
			Random rand = new Random();
			hand.remove(rand.nextInt(handSize)); 
		}

	}
}


public Card implements Comparable{
	public final static String suit;
	public final static int amount;
	public final static String name;
	
	Card(String suit, string amt){
		suit = suit;
		amount =  amt;
		switch(amt){
			case 10: 
				name = "Jack of " + suit; 
				break;
			case 11: 
				name = "Queen of " + suit; 
				break;
			case 12: 
				name = "King of " + suit; 
				break;
			case 13: 
				name = "Ace of " + suit; 
				break;
			default: 
				name = amount.ToString() + " of " + suit;
				break;
		}
	
	public static int compareTo(Card card){
		if      (this.amount > card.amount) return 1;
		else if (this.amount = card.amount) return 0;
		else if (this.amount < card.amount) return -1;
	}

	}
}
