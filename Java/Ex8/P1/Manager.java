public class Manager extends Employee { 

    Manager() { super(2900); generateNumberHours(); }
    public void generateNumberHours(){ setH(rand.nextInt(6) + 6);}
}