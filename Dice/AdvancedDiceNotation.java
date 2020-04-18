
import java.util.ArrayList;

class AdvancedDiceNotation {

    private ArrayList<SimpleDiceNotation> sdnList;  //list of simple dice notation objects  
    private int mod;                           //optional positive integer      

    /** Constructor
     *  Precondition: myDice represents a valid Advanced
     *  Dice Notation Statement
     */
    public AdvancedDiceNotation (String myDice) {
        sdnList = new ArrayList<SimpleDiceNotation>();
        parse(myDice);
    } 

    /** The parse method reads the String parameter myDice and fills the   
     *  sdnList with valid SimpleDiceNotation objects accordingly.  Also 
     *  assigns a value to mod if necessary (leaves it as zero otherwise).
     *  Precondition: myDice represents a valid Advanced
     *                Dice Notation Statement
     */ 
    private void parse(String myDice) {
        /* implementation not shown */
        while (myDice.indexOf("+") != 0) {
            int dIndex = myDice.indexOf("D");
            int plusIndex = myDice.indexOf("+");            
            int x = 0;
            int n = 0;
            x = Integer.parseInt(myDice.charAt(dIndex - 1) + "");
            n = Integer.parseInt(myDice.charAt(dIndex + 1) + "");
            String str = new String (x + "D" + n);
            SimpleDiceNotation s = new SimpleDiceNotation(str);
            sdnList.add(s);
            myDice = myDice.substring(plusIndex + 1);
        }

        if (!myDice.contains("D")) {
            mod = Integer.parseInt(myDice);
        }

        else {
            int dIndex = myDice.indexOf("D");
            int plusIndex = myDice.indexOf("+");            
            int x = 0;
            int n = 0;
            x = Integer.parseInt(myDice.charAt(dIndex - 1) + "");
            n = Integer.parseInt(myDice.charAt(dIndex + 1) + "");
            String str = new String (x + "D" + n);
            SimpleDiceNotation s = new SimpleDiceNotation(str);
            sdnList.add(s);
        }
    }

    public int roll() {
        /* implementation not shown */
        int sum = 0;
        for (int i = 0; i < sdnList.size(); i ++) {
            SimpleDiceNotation s = sdnList.get(i);
            sum += s.roll();
        }
        return sum;
    }
}

