import java.util.ArrayList;
import java.util.List;
/**
 * The main method does most things
 *     Ideally should be moved into its class
 * */
public class Main {
    public static void main(String[] args) {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card());
        hand.add(new Card());
        hand.add(new Card());
        hand.add(new Card());
        hand.add(new Card());
        System.out.println(judgeHand(hand));
    }

    public static String judgeHand(List<Card> hand){
        if  (checkForFullHouse(hand))   {return "Full House";
        }else if(checkForFlush(hand))   {return "Flush";
        }else if(checkFor4Kind(hand))   {return "Four-of-a-Kind";
        }else if(checkFor3Kind(hand))   {return "Three-of-a-Kind";
        }else{return "No Special Hand";}

    }

    /**
     * Compares each Card and counts each match
     * When a suit has 2 or 3 matches, a boolean is ticked
     * Structured so a 3 cannot activate a 2
     * @param hand
     * @return
     */
    public static boolean checkForFullHouse(List<Card> hand){
        int matchingCardCounter;
        boolean threeMatches = false;
        boolean twoMatches = false;
        for(Card card1:hand){
            matchingCardCounter = 0;
            for(Card card2:hand){
                if(card1.getFace()==card2.getFace()){
                    matchingCardCounter++;
                }
            }
            if(matchingCardCounter==3){threeMatches=true;} else if(matchingCardCounter==2){twoMatches=true;}else{return false;}
            }
        if(threeMatches && twoMatches){return true;}else{return false;}
        }

    /**
     * Takes a suit from a card and compares to the entire hand.
     * @param hand
     * @return
     */
    public static boolean checkForFlush(List<Card> hand){
        String suit = hand.get(1).getSuit();
        for(Card card:hand){
            if(card.getSuit().equals(suit)){}else{return false;}
        }
        return true;
    }

    /**
     * Works the same as checkForFullHouse, but without the 2 requirement
     * @param hand
     * @return
     */
    public static boolean checkFor3Kind(List<Card> hand){
        int matchingCardCounter;
        boolean threeMatches = false;
        for(Card card1:hand){
            matchingCardCounter = 0;
            for(Card card2:hand){
                if(card1.getSuit().equals(card2.getSuit())){
                    matchingCardCounter++;
                }
            }
            if(matchingCardCounter>=3){threeMatches=true;}
        }
        if(threeMatches){return true;}else{return false;}
        }

    /**
     * Works the same as checkFor3Kind, but requires four instead of three
     * @param hand
     * @return
     */
    public static boolean checkFor4Kind(List<Card> hand){
        int matchingCardCounter;
        boolean fourMatches = false;
        for(Card card1:hand){
            matchingCardCounter = 0;
            for(Card card2:hand){
                if(card1.getSuit().equals(card2.getSuit())){
                    matchingCardCounter++;
                }
            }
            if(matchingCardCounter>=4){fourMatches=true;}
        }
        if(fourMatches){return true;}else{return false;}
    }
}