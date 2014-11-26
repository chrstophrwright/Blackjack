// Chris Wright
// Nov 24, 2014

import java.util.*;

public abstract class Deck{

	public static ArrayList<Card> deck;
	public static int deckSize;

	Deck(int deckSize){
		deck = new ArrayList<Card>[deckSize]();
		decksize = deckSize;
	}

	public card dealCard(){
		Card topCard = this.get(0);
		this.remove(0);
		this.deckSize --;
		return topCard;
	}

	public card[] dealCards(int num){
		ArrayList<Card> cardSet = new ArrayList<Card>();
		while (num){
			cardSet.add(dealCard());
			num--;
		}
		return cardSet;
	}

	public void shuffleDeck(){
		Random rand = newRandom();
		int i = 0;
		while (i<this.deckSize){
			Card card = this[i];
			int swap = rand.nextInt(52);
			Card temp = deck.get(swap);
			this[swap] = card;
			this[i] = temp;
		}
	}
	
}