/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//Lab04
//PokerHandCheck
//
//
//
import java.lang.Math; 
import java.util.Random;

public class PokerHandCheck {
    //main method required for every Java program
    public static void main(String[] args)  {
        //
        
        int cardOneType = (int)(Math.random()*(4+1))+1;
        
        String[] cardOneValue = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","King","Ace"};
        Random random = new Random();
        int select = random.nextInt(cardOneValue.length);
        //
        //
        //
        
        
        //
        //
        if (cardOneType==1)
        System.out.println(cardOneValue[select]+" of Spades");
        else if (cardOneType==2)
        System.out.println(cardOneValue[select]+" of Hearts");
        else if (cardOneType==3)
        System.out.println(cardOneValue[select]+" of Diamonds");
        else if (cardOneType==4)
        System.out.println(cardOneValue[select]+" of Clubs"); 
        
        
    }
}