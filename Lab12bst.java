// Lab12bvst.java     This is the Student-Starting file.
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck
{
	private ArrayList<Card> cards;
	private int size;
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	private String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};




	public Deck()
  {

		cards = new ArrayList<Card>();

		for(int k= 0; k<4; k++){
			for(int x= 0; x<13; x++){
				Card card = new Card(suits[k],ranks[x],values[x]);
				cards.add(card);
				size++;
			}
		}
		shuffle();
	}
/*public void shuffle(){
	for(int k=0; k<1000; k++){
		int rnd1 = (int) (Math.random()* 52);
		int rnd2 = (int) (Math.random()* 52);
		Card temp = cards.get(rnd1);
		cards.set(rnd1,cards.get(rnd2));
		cards.set(rnd2, temp);
	}
}*/
public void shuffle(){
	for(int k=0;k<size;k++){
		int rand = (int) (Math.random()* 52);
		Card temp = cards.get(k);
		cards.set(k,cards.get(rand));
		cards.set(rand, temp);
	}
}

//to string method
	public String toString(){
		String deckString = "";
		for(int index = 0; index<cards.size(); index++){
			deckString += "" + cards.get(index).toString() + "\n";
		}
		return deckString;
}
}
