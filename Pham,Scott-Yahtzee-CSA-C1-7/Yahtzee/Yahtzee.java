import java.util.Scanner;
public class Yahtzee {
    /**
     * Contains the current value of the die
     */
    DieN die1;
    DieN die2;
    DieN die3;
    DieN die4;
    DieN die5;
    private int value;
    private int dienum;

    public Yahtzee() {
        die1 = new DieN(6);
        die2 = new DieN(6);
        die3 = new DieN(6);
        die4 = new DieN(6);
        die5 = new DieN(6);
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public void roll(int dieNumber) {
        dienum = dieNumber;
        if (dienum == 1) {
            die1.roll();
        }
        if (dienum == 2) {
            die1.roll();
            die2.roll();
        }
        if (dienum == 3) {
            die1.roll();
            die2.roll();
            die3.roll();
        }
        if (dienum == 4) {
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
        }
        if (dienum == 5) {
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
            die5.roll();
        }
    }
    
    public String summarize() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        String allvalues = +die1.getValue()+ " " +die2.getValue()+ " " +die3.getValue()+ " " +die4.getValue()+ " " +die5.getValue();
        Scanner s = new Scanner(allvalues);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a == 1) {
                count1++;
            }
            if (a == 2) {
                count2++;
            }
            if (a == 3) {
                count3++;
            }
            if (a == 4) {
                count4++;
            }
            if (a == 5) {
                count5++;
            }
            if (a == 6) {
                count6++;
            }
        }
        String summary = "1-" +count1+ "; 2-" +count2+ "; 3-" +count3+ "; 4-" +count4+ "; 5-" +count5+ "; 6-" +count6;    
        return summary;
        }
        
    public String toString() {
        String n = "Dice Values: " +die1.getValue()+ ", " +die2.getValue()+ ", " +die3.getValue()+ ", " +die4.getValue()+ ", " +die5.getValue();
        return n;
    }
}
