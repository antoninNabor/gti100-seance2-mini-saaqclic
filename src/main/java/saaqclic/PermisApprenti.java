package saaqclic;

/** Mission 4 : un permis d'apprenti est un permis dont le seuil est plus bas. */
public class PermisApprenti extends Permis /* TODO Mission 4 : héritez de Permis */ {

    public PermisApprenti(String numero, String titulaire) {
        // TODO Mission 4 : transmettez numero et titulaire au constructeur parent.
        super(numero, titulaire);

    }

    // TODO Mission 4 : redéfinissez limitePoints() pour retourner 4.
    @Override 
    public int limitePoints() {
        return 4;
    }
    // TODO Mission 4 : redéfinissez toString() pour ajouter " [apprenti]"
    // à la fin du texte produit par le parent.
    @Override 
    public String toString() {
        return super.toString() + " [apprenti]" ;
    }
}
