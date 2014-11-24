public class 52Card extends Card{
	public final String type;

	52Card(String kind, int amount){
		type = kind;
		value = amount;

		switch(amount){
			case 10: 
				name = "Jack of " + type; 
				break;
			case 11: 
				name = "Queen of " + type; 
				break;
			case 12: 
				name = "King of " + type; 
				break;
			case 13: 
				name = "Ace of " + type; 
				break;
			default: 
				name = amount.ToString() + " of " + type;
				break;
		}
	}
}