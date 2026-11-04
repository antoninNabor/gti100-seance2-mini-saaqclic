package saaqclic;

/** Mission 5 : renouvellement d'un permis. */
public class Renouvellement extends Transaction/* TODO Mission 5 : héritez de Transaction */ {

    private int annees;
    private boolean enLigne;

    public Renouvellement(String reference, int annees, boolean enLigne) {
        // TODO Mission 5 : transmettez reference au parent et gardez annees et enLigne.
        super(reference);
        this.annees = annees;
        this.enLigne = enLigne;
    }

    
    // TODO Mission 5 : redéfinissez montant() en réutilisant Tarifs.
    @Override 
    public double montant() {
        return Tarifs.fraisRenouvellement(this.annees, this.enLigne);
    }
    // TODO Mission 5 : redéfinissez description(). Exemple : Renouvellement 2 an(s)
    @Override 
    public String description() {
        return "Renouvellement " + this.annees + " an(s)";
    }
}
