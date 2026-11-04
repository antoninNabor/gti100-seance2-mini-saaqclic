package saaqclic;

/** Mission 3 : méthodes static et passage de paramètres. */
public class Guichet {

    public static void corrigerTitulaire(Permis permis, String nouveauTitulaire) {
        // Mission 3 : ce code compile, mais il ne corrige rien pour l'appelant. Pourquoi ?
        // Il vous faudra ajouter une méthode dans Permis.
        permis.setTitulaire(nouveauTitulaire);
    }

    public static Permis remplacer(Permis ancien, String nouveauNumero) {
        // TODO Mission 3 : retournez un nouveau permis, même titulaire et mêmes points.

        return new Permis(nouveauNumero,ancien.getTitulaire(),ancien.getPoints());
    }

    public static int compterSuspendus(Permis[] permis) {
        // TODO Mission 3 : comptez les permis suspendus. Certaines cases peuvent valoir null.
        int nbInvalide = 0;
        
        for (Permis p: permis) {
            if (p != null && p.estSuspendu()) {
                nbInvalide++;
            }

        }
        return nbInvalide;
    }
}
