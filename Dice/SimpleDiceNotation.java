
public class SimpleDiceNotation
{
    private int x; //number of dice
    private int n; //number of sides

    /**
     * Constructor for objects of class SimpleDiceNotation
     */
    public SimpleDiceNotation()
    {
        this.x = 1;
        this.n = 6;
    }

    public SimpleDiceNotation(String s)
    {
        int a = s.indexOf("D");
        String num = s.substring(0, a);
        String sides = s.substring(a + 1);
        this.x = Integer.parseInt(num);
        this.n = Integer.parseInt(sides);
    }

    public SimpleDiceNotation(SimpleDiceNotation s)
    {
        this.x = s.x;
        this.n = s.n;
    }

    public int roll() {
        int x = this.x;
        int n = this.n;
        int sum = 0;
        for (int i = 0; i < x; i ++) {
            sum += (int) (Math.random()*n + 1);
        }
        return sum;
    }

    public String toString() {
        String str = "";
        int x = this.x;
        int n = this.n;
        str += x + "D" + n;
        return str;
    }

    public boolean equals(SimpleDiceNotation s) {
        if (this.x == s.x && this.n == s.n) return true;
        return false;
    }
}
