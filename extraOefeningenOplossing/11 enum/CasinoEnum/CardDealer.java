package CasinoEnum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import DeckEnum.Card;
import DeckEnum.Deck;

public class CardDealer {
	
	private Random rand = new Random();
	Deck deck = new Deck();
	
	public void ShuffleDeckHalf(int amount) {
		Card[] temp = deck.getDeck(); 
	}
	
	public void ShuffleDeckHand(int amount) {
		Card[] temp = deck.getDeck(); 
	}
	
	private Card[] indexSwap(int index, Card[] arrayIn) {
		int arrayLengte = arrayIn.length;
		int split = rand.nextInt(arrayLengte);
		
		Card[] temp = Arrays.copyOf(arrayIn, split);
		Card[] temp2 = Arrays.copyOfRange(arrayIn, split+1, arrayLengte);		
		
		return temp;
	}
	
	private Card[] combineCards(Card [] first, Card[] second) {
		int lengte = first.length + second.length;
		Card[] combine = new Card[lengte]; 
		return null;
	};
}
