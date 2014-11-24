public Hand extends Deck(){
	public static ArrayList <Card> hand;
	public static int handSize;

	Hand(){
		hand = new ArrayList<Card>();
		handSize = 0;
	}

	public void addToHand(Card card){
		hand.add(card);
	}

	public void discard(int card){
		this.remove(card);
		this.handSize --;
	}

	public randomDiscard(){
		Random rand = new Random();
		hand.remove(rand.nextInt(handSize)); 
	}
	
}