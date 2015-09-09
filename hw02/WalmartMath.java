/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw02
//Walmart Arithmetic Program
//
//
//Number of pairs of socks

public class WalmartMath {
    //main method required for every Java program
    public static void main(String[] args)  {

        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        //
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        //coding>math..
        //
        //
        //all the calculations requested are below
        //
        //calculations for specifically socks
        double socksTotal$= nSocks*sockCost$;
        //calculating total cost of socks
        double glassTotal$= nGlasses*glassCost$;
        //calculating total cost of
        double envelopesTotal$=nEnvelopes*envelopeCost$;
        //calculating total cost of envelopes without tax
        double envelopesTotalWithTax$=nEnvelopes*envelopeCost$+taxPercent*(nEnvelopes*envelopeCost$);
        //calculating total cost of envelopes with tax
        double envelopeTax$=taxPercent*(nEnvelopes*envelopeCost$);
        //calculating total cost of envelope tax by itself
        double totalCost$=socksTotal$+glassTotal$+envelopesTotal$;
        //calculating total cost of everything excluding tax
        double totalCostWithTax$=socksTotal$+glassTotal$+envelopesTotalWithTax$;
        //calculating total cost of everything including tax
        //make sure these calculations do not print and int for yet a double
        //as there are ints that have been mandatorily assigned 
        //
        //the homework assignment is very cryptic in terms of if the taxPercent
        //applies to only envelopes or each item
        //realistically items have different tax percents
        //however I'll just make the effort to code out taxes using "taxPecent"
        //for socks and glass aswell bellow along with the total sum with their
        //taxes included
        //
        //
        double socksTax$=socksTotal$*taxPercent;
        //tax on 3 pairs of socks
        double socksTotalWithTax$=socksTotal$+socksTax$;
        //total cost of 3 pairs of socks with tax
        double glassTax$=glassTotal$*taxPercent;
        //tax on 6 glasses
        double glassTotalWithTax$=glassTotal$+glassTax$;
        //total cost of 6 glasses with tax
        double totalCostWithAllValuesTaxed$=socksTotalWithTax$+glassTotalWithTax$+envelopesTotalWithTax$;
        //total cost of everything with socks and glasses taxed
        //
        //code for printing all the data out below
        System.out.println("Total cost of socks is "+socksTotal$+ " dollars");
        System.out.println("Total cost of glass is "+glassTotal$+ " dollars");
        System.out.println("Total cost of envelopes is "+envelopesTotal$+ " dollars");
        //
        System.out.println("Total cost of tax on envelopes is "+envelopeTax$+" dollars");
        System.out.println("Total cost of envelopes with tax is "+envelopesTotalWithTax$+ " dollars");
        System.out.println("Total cost of everything without tax is " +totalCost$+" dollars");
        System.out.println("Total cost of everything with tax (yet not on socks or glasses)is "+totalCostWithTax$+ " dollars");
        //
        //note these values are if "taxPercent" also applies to socks and glasses
        System.out.println("These values below are only if taxPercent also applies to socks and glasses");
        System.out.println("Total cost of tax on 3 socks is "+socksTax$+" dollars");
        System.out.println("Total cost of socks with tax is "+socksTotalWithTax$+" dollars");
        System.out.println("Total cost of tax on 6 glasses is "+glassTax$+" dollars");
        System.out.println("Total cost of glasses with tax is "+glassTotalWithTax$+" dollars");
        System.out.println("No idea where the 1 at the end of the decimal is coming from");
        //somehow my code managed to put a random 00000000001 onto the decimal
        //I hope I don't get points off for this tomfoolery
        System.out.println("Total cost of everything with tax on glasses and socks is "+totalCostWithAllValuesTaxed$+" dollars");
        
        
    }
}

        
        //when you finish this up see what else you need to add this is just the raw(checked)
        //info there are definitely major tweeks that need to be made(checked)