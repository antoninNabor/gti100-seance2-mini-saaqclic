package saaqclic;

class Amende extends Transaction{
    private String reference;
    private double montantBase;
    private int joursDeRetard;
    public static final double TAUX_RETARD = 2.0;
    public Amende(String reference, double montantBase, int joursDeRetard) {
        super(reference);
        this.montantBase = montantBase;
        this.joursDeRetard = joursDeRetard;
    }
    public double getMontantBase() {
        return this.montantBase;
    }
    public int getJoursDeRetard() {
        return this.joursDeRetard;
    }

    public double montant() {
        return getMontantBase() + (TAUX_RETARD * getJoursDeRetard());
    }
    public String description() {
        return "Amende (" + getJoursDeRetard() + " j de retard)";
    }

    
}