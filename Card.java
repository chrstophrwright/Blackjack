public class Card implements Comparable{
	public final String name;
	public final int value;

	Card(String name, int amount){
		value = amount;
		name = name;
	}

	public static int compareTo(Card card){
		if       (this.amount > card.amount) return 1;
		else if ((this.amount = card.amount)&&(this.name == card.name)) return 0;
		else if  (this.amount < card.amount) return -1;
	}
}
