
public class DiceDriver
{
    public static void main (String[] args) {
        SimpleDiceNotation s = new SimpleDiceNotation("2D6");
        int sum = s.roll();
        System.out.println("sum: " + sum);
        System.out.println("s: " + s);
        SimpleDiceNotation t = new SimpleDiceNotation(s);
        System.out.println("t equals: "+ t.equals(s));
        
        //AdvancedDiceNotation d = new AdvancedDiceNotation("2D6+2D8");
        //System.out.println("d: " + d);

    }
}
