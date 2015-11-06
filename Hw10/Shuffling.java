/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw10
//Shuffling 
//11/3/2015
//
//
import java.util.Scanner;
public class Shuffling{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }


    public static void printArray(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
        cards[i]=1;
        System.out.print(cards[i] + " ");
        }
    }

    public static void shuffle(String[] cards){
      
        for (int i = cards.length - 1; i>0; i--); {
            int x = (int)(Math.random()*(i + 1));
            int y = cards[i];
            double temp = cards[i];
            cards[i] = cards[y];
            cards[x] = y;
            System.out.println("Shuffled");
        }
    }

    public static void randomizeHand(String[] cards){
        for (int i = 0; i < 4; i++) {
            String suitNames1 = suitNames[cards[i] / 13];
            String rankNames1 = rankNames[cards[i] % 13];
            System.out.println("Card number " + cards[i] + ": "+ rankNames + " of " + suitNames);
        }
    }
}
