public class 52Deck extends Deck(){
	private static String[] suits; = ["Clubs","Diamonds","Hearts","Spades"] ;
	private static int[] amounts; = [1,2,3,4,5,6,7,8,9,10,11,12,13];

	Deck(){		
		deck = new ArrayList<Card>[52]();
		decksize = 52;
		for (int j=0; j<4; j++){
			for (int k=0; k<13; k++){
				deck[i] = new 52Card(suits[j], amounts[k])
			}
		}
	}

}