package saaqclic;

/** Missions 2 et 3 : un permis de conduire. Règles simplifiées pour l'exercice. */
public class Permis {

    // TODO Mission 3 : ajoutez ici un attribut partagé par tous les permis pour les compter.

    private String numero;
    private String titulaire;
    private int points;

    public Permis(String numero, String titulaire, int points) {
        // Mission 2 : ce constructeur contient un bogue. Les tests vous aideront à le trouver.
        // Il doit aussi ramener à 0 un nombre de points négatif.
        this.numero = numero;
        this.titulaire = titulaire;
        if (points < 0) {points = 0;}
        this.points = points;
        
    }

    public Permis(String numero, String titulaire) {
        // TODO Mission 2 : appelez l'autre constructeur avec 0 point.
        this(numero,titulaire, 0);
    }

    public static int nombreEmis() {
        // TODO Mission 3 : retournez le nombre de permis créés depuis le début du programme.
        throw new UnsupportedOperationException("TODO Mission 3 : nombreEmis");
    }

    public String getNumero() {
        return this.numero;
    }

    public String getTitulaire() {
        return this.titulaire;
    }

    public int getPoints() {
        return this.points;
    }

    public void ajouterPoints(int nombre) {
        // TODO Mission 2 : ajoutez nombre aux points, seulement si nombre est positif.
        if (nombre >=0 ) {
            points = getPoints() + nombre;
        }
        
    }

    public boolean estSuspendu() {
        // TODO Mission 2 : suspendu dès que les points atteignent limitePoints().
        if (getPoints() >= limitePoints()) {return true;}
        return false;
    }

    /** Seuil de points d'inaptitude de ce permis. */
    public int limitePoints() {
        return 15;
    }

    @Override
    public String toString() {
        return numero + " (" + titulaire + ") : " + points + " pts";
    }
}
