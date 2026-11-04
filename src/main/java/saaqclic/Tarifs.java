package saaqclic;

/** Mission 1 : méthodes, surcharge et Javadoc. Tarifs fictifs. */
public class Tarifs {

    public static final double TARIF_ANNUEL = 30.0;
    public static final double RABAIS_EN_LIGNE = 5.0;

    public static double fraisRenouvellement(int annees) {
        // TODO Mission 1 : TARIF_ANNUEL par année. Une durée nulle ou négative coûte 0.
        if (annees <= 0) { return 0.0;}
        
        return TARIF_ANNUEL * annees;

    }

    public static double fraisRenouvellement(int annees, boolean enLigne) {
        // TODO Mission 1 : réutilisez la méthode ci-dessus au lieu de recopier le calcul.
        // En ligne, on retire RABAIS_EN_LIGNE, sans jamais descendre sous 0.
        double fraisBase = fraisRenouvellement(annees);
        if (enLigne) { 
            if (fraisBase > RABAIS_EN_LIGNE) {
                return fraisBase - RABAIS_EN_LIGNE;
            }
            
        }

        return fraisBase;
        
    }

    // TODO Mission 1 : écrivez ici la Javadoc de numeroValide (paramètre et valeur de retour).
    /**
     * Verifie si un numero est valide : une lettre majuscule (A a Z)
     * suivie de 12 chiffres, pour 13 caracteres au total
     * @param numero le numero a verifier  (peut etre null)
     * @return true si le numero est vakudem false sinon
     */
    public static boolean numeroValide(String numero) {
        // TODO Mission 1 : une lettre majuscule (A à Z) suivie de 12 chiffres, 13 caractères en tout.
        // Si numero vaut null, retournez false. Character.isDigit(c) vous sera utile
        if (numero == null || numero.length() != 13) {return false;}
        char first = numero.charAt(0);
        if (first < 'A' || first > 'Z') {return false;}

        
        for (int i = 1; i<numero.length();i++) {
            if (!Character.isDigit(numero.charAt(i))) {
                return false;
            }
                
            
            
        }
        return true;
        
        
    }
}
