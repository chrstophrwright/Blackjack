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
	
	public <T> getCardInfo(<T> info){
		return card.info;
	}

	public <T>getHandInfo(<T> info){
		<T> infoSum;
		while (Card in Hand){
			infoSum += getCardInfo(info);
		}
		return infoSum;
	}

	public getCardsInHand(){
		return getHandInfo(name)
	}

	public int getSum(){
		return getHandInfo(amount);
	}

	public int getSum(){
		int sum = 0;
		while (card in hand){
			total += card.amount;
		}
		return sum;
	}
}