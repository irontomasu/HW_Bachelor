public class Regular extends Employee { 

   Regular() { super(2000); generateNumberHours(); }
    public void generateNumberHours(){ setH(rand.nextInt(2) + 8);}
}