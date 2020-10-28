public class PartTime extends Employee { 

   PartTime() { super(1000); generateNumberHours(); }
    public void generateNumberHours(){ setH(rand.nextInt(5));}
}