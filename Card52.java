public class Card52 extends Card{
	public final String type;

	52Card(String kind, int amount){
		type = kind;
		value = amount;

		switch(amount){
			case 11: 
				name = "Jack of " + type; 
				break;
			case 12: 
				name = "Queen of " + type; 
				break;
			case 13: 
				name = "King of " + type; 
				break;
			case 14: 
				name = "Ace of " + type; 
				break;
			default: 
				name = amount.ToString() + " of " + type;
				break;
		}
	}

	public static int compareTo(Card card){
		if      (this.amount > card.amount) return 1;
		else if (this.amount = card.amount) return 0;
		else if (this.amount < card.amount) return -1;
	}

	public static int getAmount(){}
	public static String getSuit(){}
	public static String getName(){}

}