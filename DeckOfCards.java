// Chris Wright
// Nov 24, 2014

import java.util.*;

public abstract class Deck implements Comparable{

	public static ArrayList<Card> deck;
	public static int deckSize;

	Deck(int deckSize){
		deck = new ArrayList<Card>[deckSize]();
		decksize = deckSize;
	}

	public void discard(int card){
		this.remove(card);
		this.deckSize --;
	}

	public card dealCards(){
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
	}

}