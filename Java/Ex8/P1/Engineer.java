public class Engineer extends Employee { 

   Engineer() { super(2500); generateNumberHours(); }
    public void generateNumberHours(){ setH(rand.nextInt(3) + 8);}
}