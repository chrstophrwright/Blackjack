abstract class Card implements Comparable{
	public final String name;
	public final int value;

	Card(String name, int amount){
		value = amount;
		name = name;
	}

	public static int compareTo(Card card);


}
