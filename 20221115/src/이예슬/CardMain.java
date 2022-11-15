package 이예슬;

public class CardMain {
public static void main(String[] args) {

	Card card = new Card ("5432-4567-9534-3657", 20251203, 253);
	card.showCardInfo();
	
	System.out.println("=====");
	TossCard tosscard = new TossCard("5432-4567-9534-3657", 20251203, 253,"신빛용"," ");
	tosscard.showCardInfo();
	
	DGBCard dgbcard = new DGBCard("5432-4567-9534-3657", 20251203, 253," ","신빛용");
	dgbcard.showCardInfo();
}
}
