import java.util.Random;

/**
 * Class that stores cards
 * Doesn't record cards, so they may repeat
 */
public class Card {
    private String suit;
    private int face;
    static final Random random = new Random();

    Card(){
        pickFace();
        pickSuit();
    }
    Card(int face, String suit){
        this.face=face;
        this.suit=suit;
    }
    public String getSuit() {return suit;}
    public int getFace() {return face;}
    public void setSuit(String suit) {this.suit = suit;}
    public void setFace(int face) {this.face = face;}

    /**
     * Picks a random number from 1 to 13
     */
    private void pickFace(){
        this.face = random.nextInt(14);
    }

    /**
     * Picks a number from one to four, then assigns a suit based on the number
     */
    private void pickSuit(){
        int suit = random.nextInt(5);
        if(suit==1){
            this.suit="Clubs";
        }else if(suit==2){
            this.suit="Hearts";
        }else if(suit==3){
            this.suit="Diamonds";
        }else{
            this.suit="Spades";
        }
    }
}

