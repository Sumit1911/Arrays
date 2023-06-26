public class Deck_of_card {
    public static void main(String[] args) {
        int deck[] = new int[52];
        //Spades--0to12, Hearts--13to25, Diamonds--26to38, Clubs--39to51
        String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(int i = 0; i<deck.length; i++) {  //initialize the card
            deck[i] = i;
        }
        for(int i = 0; i<deck.length; i++) {
            //generate index random
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //display first four cards
        // for(int i = 0; i<4; i++) {
        //     String suit = suits[deck[i]/13];
        //     String rank = ranks[deck[i]%13];
        //     System.out.println("cand number " + deck[i] + " : " + rank + " of " + suit);
        // }
        for(int i = 0;i<4; i++) {
            int cardNumber = (int)(Math.random()*deck.length);
            String suit = suits[cardNumber/13];
            String rank = ranks[cardNumber%13];
            System.out.println("Card number " + cardNumber + " : " + rank + " of " + suit);
        }
    }

}
