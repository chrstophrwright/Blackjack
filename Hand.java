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